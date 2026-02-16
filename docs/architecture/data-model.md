# Data Model Documentation

**Path:** `/docs/architecture/data-model.md`

**Title:** As a backend-ready system, I want documented data models for future scaling.

**Version:** 1.0

**Status:** Draft

---

## 1. Purpose

This document defines the system’s data model to ensure structural clarity, scalability readiness, and future backend integration compatibility.

The data model establishes entity definitions, relationships, constraints, and referential integrity rules required for a scalable, maintainable architecture.

---

## 2. Entity-Relationship (ER) Diagram

### High-Level ER Structure

```
User
 └──< GroupMember >── Group
                         └──< Expense >──< ExpenseShare >
                         └──< Reminder >
```

### Core Relationships Overview

* A **User** can belong to multiple **Groups**.
* A **Group** can contain multiple **Expenses**.
* An **Expense** can have multiple **ExpenseShares**.
* A **Group** can have multiple **Reminders**.
* A **Reminder** may optionally reference an **Expense**.

---

## 3. Entities & Field Definitions

### 3.1 User

Represents an individual participating in expense groups.

| Field Name | Type      | Description            |
| ---------- | --------- | ---------------------- |
| id         | UUID / PK | Unique identifier      |
| name       | String    | User display name      |
| email      | String    | Optional contact email |
| created_at | Timestamp | Record creation time   |

**Primary Key:** `id`

---

### 3.2 Group

Represents a collection of users managing shared expenses.

| Field Name  | Type      | Description                |
| ----------- | --------- | -------------------------- |
| id          | UUID / PK | Unique group identifier    |
| name        | String    | Group name                 |
| description | String    | Optional group description |
| created_at  | Timestamp | Creation timestamp         |

**Primary Key:** `id`

---

### 3.3 GroupMember (Join Table)

Defines the many-to-many relationship between Users and Groups.

| Field Name | Type      | Description                |
| ---------- | --------- | -------------------------- |
| id         | UUID / PK | Unique identifier          |
| user_id    | UUID / FK | References User(id)        |
| group_id   | UUID / FK | References Group(id)       |
| role       | String    | Member role (admin/member) |

**Foreign Keys:**

* `user_id → User.id`
* `group_id → Group.id`

---

### 3.4 Expense

Represents a financial transaction within a group.

| Field Name  | Type      | Description                    |
| ----------- | --------- | ------------------------------ |
| id          | UUID / PK | Unique expense identifier      |
| group_id    | UUID / FK | Associated group               |
| paid_by     | UUID / FK | User who paid                  |
| amount      | Decimal   | Total expense amount           |
| type        | Enum      | equal / percent / share / item |
| description | String    | Optional notes                 |
| created_at  | Timestamp | Creation time                  |

**Foreign Keys:**

* `group_id → Group.id`
* `paid_by → User.id`

---

### 3.5 ExpenseShare

Defines how an expense is split among participants.

| Field Name   | Type      | Description                  |
| ------------ | --------- | ---------------------------- |
| id           | UUID / PK | Unique identifier            |
| expense_id   | UUID / FK | Associated expense           |
| user_id      | UUID / FK | User responsible for share   |
| share_amount | Decimal   | Calculated or assigned share |

**Foreign Keys:**

* `expense_id → Expense.id`
* `user_id → User.id`

---

### 3.6 Reminder

Represents a scheduled reminder related to a group or expense.

| Field Name   | Type                 | Description                |
| ------------ | -------------------- | -------------------------- |
| id           | UUID / PK            | Unique identifier          |
| group_id     | UUID / FK            | Associated group           |
| expense_id   | UUID / FK (nullable) | Optional linked expense    |
| scheduled_at | Timestamp            | Reminder trigger time      |
| status       | Enum                 | pending / sent / cancelled |

**Foreign Keys:**

* `group_id → Group.id`
* `expense_id → Expense.id` (optional)

---

## 4. Foreign Key Relationships Summary

| Child Entity | Foreign Key | References            |
| ------------ | ----------- | --------------------- |
| GroupMember  | user_id     | User.id               |
| GroupMember  | group_id    | Group.id              |
| Expense      | group_id    | Group.id              |
| Expense      | paid_by     | User.id               |
| ExpenseShare | expense_id  | Expense.id            |
| ExpenseShare | user_id     | User.id               |
| Reminder     | group_id    | Group.id              |
| Reminder     | expense_id  | Expense.id (nullable) |

All foreign keys enforce referential integrity with cascading rules defined at the database layer.

---

## 5. Reminder–Expense Relationship

The Reminder entity optionally references an Expense entity.

### Design Justification:

* Allows reminders for:
    - Entire group settlements
    - Specific unpaid expenses
* Supports future backend notification syncing
* Maintains flexibility for non-expense reminders

### Relationship Type:

* One Expense → Many Reminders
* One Reminder → Zero or One Expense

This optional association ensures system flexibility while maintaining structured integrity.

---

## 6. Scalability & Backend Readiness Considerations

* UUID-based identifiers allow safe distributed ID generation.
* Schema supports migration versioning.
* Clear relational mapping enables backend API mirroring.
* Entities are normalized to prevent redundancy.
* Designed for future synchronization layer integration.

---

## 7. Acceptance Criteria Validation

✔ ER diagram created

✔ Entity relationships explained

✔ Field definitions documented

✔ Foreign keys defined

✔ Reminder–Expense relationship documented

---

**Document Owner:** Architecture Team

**Technical Reviewer:** Backend Lead

**Version:** 1.0

**Last Updated:** *(To be updated)*

---

