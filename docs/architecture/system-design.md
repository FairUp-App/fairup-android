# System Architecture Documentation

**Path:** `/docs/architecture/system-design.md`

**Title:** As an architect, I want to document the system architecture so that system design is clear.

**Version:** 1.0

**Status:** Active

---

## 1. Purpose

This document defines the overall system architecture of the application to ensure:

* Clear explanation of architectural decisions
* Transparent system boundaries
* Defined data flow across layers
* Documented offline-first strategy
* Structured reminder scheduling design
* Defined future synchronization approach

The system is designed to meet production-grade standards and support long-term scalability and maintainability.

---

## 2. Architectural Style – Clean Architecture

The application follows **Clean Architecture** principles to enforce strict separation of concerns and maintain independence between layers.

### 2.1 Core Principles

* Separation of concerns
* Dependency inversion
* Framework independence
* Testable business logic
* Replaceable infrastructure

### 2.2 Dependency Rule

All dependencies point inward toward the Domain layer:

Presentation → Domain ← Data

* The Domain layer contains pure business logic.
* The Presentation layer depends only on Domain abstractions.
* The Data layer implements Domain interfaces.

The Domain layer has zero dependency on Android or third-party libraries.

---

## 3. Layered Architecture Overview

The system consists of three primary layers:

1. Presentation Layer
2. Domain Layer
3. Data Layer

---

## 4. Layer Diagram

| Presentation Layer    |
| --------------------- |
| - Jetpack Compose UI  |
| - ViewModels          |
| - UI State Management |

↓

| Domain Layer            |
| ----------------------- |
| - Use Cases             |
| - Business Rules        |
| - Domain Models         |
| - Repository Interfaces |

↓

| Data Layer                   |
| ---------------------------- |
| - Repository Implementations |
| - Room Database              |
| - WorkManager                |
| - Retrofit (Future)          |
| - CameraX Integration        |

---

## 5. Layer Responsibilities

### 5.1 Presentation Layer

**Responsibilities**

* Render UI using Jetpack Compose
* Handle user interactions
* Manage UI state
* Observe ViewModel state
* Trigger use cases

**Constraints**

* No business logic
* No direct database access
* No direct networking

---

### 5.2 Domain Layer

**Responsibilities**

* Define business rules
* Implement use cases
* Define domain models
* Declare repository contracts

**Characteristics**

* Pure Kotlin
* No Android framework dependency
* Fully unit-testable

This layer represents the core of the system.

---

### 5.3 Data Layer

**Responsibilities**

* Implement repository interfaces
* Handle local persistence via Room
* Manage background scheduling via WorkManager
* Integrate hardware components via CameraX
* Manage remote communication (future via Retrofit)

The Data layer translates external data into domain models.

---

## 6. Data Flow Explanation

### Example: Creating an Entity

User Action

↓

Composable Screen

↓

ViewModel

↓

CreateEntityUseCase

↓

Repository Interface

↓

Repository Implementation

↓

Room DAO

↓

SQLite Database

### Flow Description

1. User triggers an action in the UI.
2. ViewModel processes the event.
3. ViewModel calls a Use Case.
4. The Use Case interacts with a repository interface.
5. The Data layer implements the repository.
6. Data is stored locally.
7. Updated state flows back upward to the UI.

This ensures strict boundary enforcement and testability.

---

## 7. Offline-First Architecture

### 7.1 Design Principle

The system is designed to operate fully without network connectivity.

### 7.2 Implementation Strategy

* Local database is the single source of truth.
* All reads occur from Room.
* All writes are committed locally first.
* Future sync will update local storage asynchronously.

### 7.3 Benefits

* Reliable user experience
* Reduced latency
* Resilience to network failures
* Improved perceived performance

Offline-first ensures production stability.

---

## 8. Reminder Scheduling Design

### 8.1 Objective

Provide reliable scheduled reminders for user-defined actions.

### 8.2 Architectural Approach

WorkManager is used for background task scheduling.

### 8.3 Reminder Flow

User Enables Reminder

↓

ViewModel

↓

ScheduleReminderUseCase

↓

ReminderScheduler

↓

WorkManager.enqueue()

↓

Worker Executes

↓

Notification Triggered

### 8.4 Design Considerations

* Survives process death
* Respects system battery optimizations
* Supports execution constraints
* Retries failed tasks
* Idempotent execution logic

This ensures reliability in production environments.

---

## 9. Sync Strategy (Future Phase)

### 9.1 Current Phase – Local Only

* Single-device persistence
* No backend integration
* Fully offline-capable

### 9.2 Future Phase – Backend Integration

Local database remains the source of truth.

Sync model:

Local Update

↓

Mark as Pending Sync

↓

Background Sync Worker

↓

Push to Server

↓

Receive Response

↓

Update Local Database

### 9.3 Conflict Resolution

Planned approach:

* Timestamp-based last-write-wins (initial version)
* Version-based conflict resolution (future improvement)
* Idempotent server endpoints

### 9.4 Sync Principles

* Never block UI for network
* Always update local storage first
* Retry failed sync operations
* Maintain data consistency

---

## 10. Architectural Strengths

* Clear separation of concerns
* Highly testable domain logic
* Framework-independent core
* Offline resilience
* Reliable background processing
* Future-ready sync capability

---

## 11. Conclusion

The system architecture:

* Implements Clean Architecture principles
* Clearly separates Presentation, Domain, and Data layers
* Enforces offline-first reliability
* Uses structured reminder scheduling
* Prepares for scalable backend integration

This design ensures production-grade quality, maintainability, and interview-ready architectural clarity.

---

**Document Owner:** Sara

**Technical Reviewer:** Mentor

**Status:** Approved

- 