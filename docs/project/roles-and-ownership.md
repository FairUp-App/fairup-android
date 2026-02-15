# FairUp – Roles & Ownership

## 1. Purpose

This document defines the roles, responsibilities, governance model, and review workflow for the FairUp project.

The objective is to:

- Establish clear ownership
- Avoid ambiguity in decision-making
- Ensure structured engineering practices
- Maintain professional development standards

FairUp is treated as a production-grade software project with defined accountability.

---

## 2. Project Roles

### 2.1 Sara – Project Owner

**Primary Accountability:** Product direction and delivery ownership

**Responsibilities:**

- Define and maintain product vision
- Define MVP scope and guard against scope creep
- Prioritize features and manage roadmap
- Define milestones and sprint goals
- Ensure acceptance criteria are met
- Maintain GitHub project board
- Track progress and completion status
- Approve readiness for release

Sara owns **what gets built and when**.

---

### 2.2 Sara – Android Architect

**Primary Accountability:** System architecture and technical direction

**Responsibilities:**

- Define system architecture (Clean Architecture)
- Maintain architecture diagrams
- Create and maintain Architecture Decision Records (ADRs)
- Define module boundaries (UI / Domain / Data)
- Define database schema (Room)
- Design reminder scheduling strategy
- Ensure separation of concerns
- Evaluate scalability and maintainability trade-offs
- Document architectural changes

Sara owns **how the system is designed**.

---

### 2.3 Sara – Lead Developer

**Primary Accountability:** Feature implementation and engineering execution

**Responsibilities:**

- Implement features using Kotlin and Jetpack Compose
- Integrate Hilt for dependency injection
- Implement Room database layer
- Implement reminder scheduling using WorkManager
- Integrate CameraX for receipt capture
- Maintain clean commit history
- Write meaningful commit messages
- Create detailed Pull Requests
- Refactor code when necessary

Sara owns **how features are implemented**.

---

### 2.4 Mentor – Technical Mentor

**Primary Accountability:** Technical guidance and strategic oversight

**Responsibilities:**

- Provide architectural feedback
- Suggest industry best practices
- Guide scalable design thinking
- Identify potential technical risks
- Review ADR decisions
- Support interview positioning
- Provide constructive improvement feedback

The mentor advises but does not override ownership without strong technical justification.

---

### 2.5 Mentor – Code Reviewer

**Primary Accountability:** Quality control and code governance

**Responsibilities:**

- Review Pull Requests
- Enforce coding standards
- Validate architecture alignment
- Ensure acceptance criteria fulfillment
- Suggest improvements
- Approve merges to integration branch

The reviewer acts as a quality gate before merging.

---

## 3. Decision-Making Model

To prevent ambiguity, the following decision ownership applies:

### 3.1 Product Decisions

**Owned by:** Sara (Project Owner)

**Examples:**

- Feature prioritization
- Scope inclusion/exclusion
- MVP boundaries
- UX decisions
- Out-of-scope enforcement

**Mentor role:** Advisory  
**Final authority:** Sara

---

### 3.2 Architectural Decisions

**Owned by:** Sara (Android Architect)

**Examples:**

- Clean Architecture adoption
- Local reminders vs server push
- Database schema design
- Dependency injection approach
- Layer separation strategy

**Requirements:**

- Must be documented in ADR format
- Must include reasoning and trade-offs

**Mentor role:** Review and challenge assumptions  
**Final authority:** Sara after discussion

---

### 3.3 Implementation Decisions

**Owned by:** Sara (Lead Developer)

**Examples:**

- Naming conventions
- Code organization
- Refactoring strategy
- Performance optimizations

**Reviewer ensures** alignment with architecture and standards.

---

## 4. Review Workflow

### 4.1 Branching Strategy

Branches:

- `main` → Production-ready releases
- `develop` → Integration branch
- `feature/*` → Individual feature branches

**Example:**
feature/group-creation
feature/expense-calculation
feature/reminder-scheduler


### 4.2 Pull Request Process

1. Create feature branch from `develop`  
2. Implement feature  
3. Ensure all acceptance criteria are satisfied  
4. Test functionality locally  
5. Create Pull Request to `develop`  
6. Include:
   - Summary of changes
   - Linked issue
   - Screenshots (for UI changes)
   - Technical notes (if architecture impacted)
7. Mentor reviews PR  
8. Address review comments  
9. Receive approval  
10. Merge into `develop`  

### 4.3 Merge Rules

- No direct commits to `main`  
- No direct commits to `develop`  
- All merges require Pull Request review  
- Architecture-impacting changes require ADR update  
- All features must link to a tracked issue  

---

## 5. Governance Principles

- Clear ownership over shared responsibility  
- Decisions documented, not assumed  
- Scope discipline enforced  
- Architecture updated with changes  
- Clean Git hygiene maintained  
- Professional engineering standards followed  

---

## 6. Accountability Matrix (RACI-Style Summary)

| Activity | Sara (Owner) | Mentor |
|----------|--------------|--------|
| Product Vision | Responsible | Consulted |
| Architecture Design | Responsible | Consulted |
| Feature Implementation | Responsible | Reviewed |
| PR Approval | Contributor | Responsible |
| Release Approval | Responsible | Consulted |
| ADR Review | Responsible | Reviewed |

---

## 7. Interview Positioning

This governance model demonstrates:

- Clear role separation  
- Ownership mindset  
- Structured decision-making  
- Professional Git workflow  
- Architecture accountability  
- Production-grade engineering discipline  

FairUp is treated as a serious engineering project rather than a classroom assignment.

---

**Document Owner:** Sara  
**Technical Reviewer:** Mentor  
**Version:** 1.0  
**Status:** Active  
