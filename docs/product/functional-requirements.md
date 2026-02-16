# Functional Requirements Documentation

**Path:** /docs/product/functional-requirements.md

**Title:** As a product owner, I want to document functional requirements so that scope is locked.

**Version:** 1.0

**Status:** Active

---

## 1. Purpose

This document defines the functional requirements of the FairUp application to ensure clarity of scope, feature coverage, and acceptance criteria for development and interview purposes.

---

## 2. Functional Requirements

### 2.1 User Management

**Requirement:** Users must be able to create accounts and manage their profiles.

**Acceptance Criteria:**

* Users can sign up using email and password.
* Users can update profile details.
* Users can view other users in their groups.

### 2.2 Group Management

**Requirement:** Users can create, join, and manage groups for shared expenses.

**Acceptance Criteria:**

* Users can create new groups.
* Users can invite others to groups.
* Users can remove members.
* Group details (name, members) can be updated.

### 2.3 Expense Management

**Requirement:** Users can record expenses with multiple types.

**Acceptance Criteria:**

* Expenses can be split equally, by percentage, by share, or by item.
* Expenses can be assigned to multiple members.
* Users can edit or delete expenses.
* Users can categorize expenses.

### 2.4 Settlement Rules

**Requirement:** System must calculate balances and settle debts.

**Acceptance Criteria:**

* Total balances are automatically calculated.
* Simplified debt settlements suggested.
* Users can mark expenses as settled.

### 2.5 Reminder Logic

**Requirement:** Users can set reminders for pending settlements.

**Acceptance Criteria:**

* Users can enable/disable reminders.
* Users can set start date, frequency, and custom messages.
* Reminders trigger notifications locally using WorkManager.
* Reminders stop automatically once settlement is done.

### 2.6 Receipt Attachment

**Requirement:** Users can attach receipts for verification.

**Acceptance Criteria:**

* Users can capture receipt via CameraX or upload images.
* Receipts are linked to corresponding expenses.
* Receipts can be viewed in expense details.

### 2.7 Acceptance Criteria per Feature

Each feature must have clear testable acceptance criteria as listed above to ensure development aligns with requirements and scope.

---

**Document Owner:** Sara

**Technical Reviewer:** Mentor

**Status:** Approved