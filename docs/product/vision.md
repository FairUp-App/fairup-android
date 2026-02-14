# FairUp – Vision & Problem Statement

## 1. Product Overview

**Product Name:** FairUp  
**Type:** Offline-first Android application  
**Category:** Expense Sharing & Settlement  
**Primary Platform:** Android (Kotlin + Jetpack Compose)

FairUp is a lightweight mobile application designed to simplify shared expense management for small groups such as roommates, students, and travel companions.

---

## 2. Vision Statement

> FairUp aims to make shared expense management simple, transparent, and stress-free for small groups by enabling fair splits, clear accountability, and timely reminders — even without internet connectivity.

The product focuses on reducing financial friction, confusion, and disputes in shared living or travel situations.

---

## 3. Target Users

### 3.1 Primary User Groups

**1. International Students**
- Shared apartments or dorms
- Splitting rent, groceries, utilities
- Budget-conscious
- Need transparency and reminders

**2. Roommates / Shared Housing**
- Monthly rent
- Utility bills
- Household items
- Subscriptions

**3. Travel Groups**
- Hotel bookings
- Transportation
- Food expenses
- Unequal contributions

---

### 3.2 User Context Diagram

```
+-------------------------+
|        User Types       |
+-------------------------+
| International Students  |
| Roommates               |
| Travel Groups           |
+-------------------------+
            |
            v
+-------------------------+
| Shared Expense Problem  |
+-------------------------+
| Who paid?               |
| Who owes?               |
| How much?               |
| When to settle?         |
+-------------------------+
```

---

## 4. Problem Statement

Managing shared expenses in small groups often results in:

- Confusion about who paid for what
- Disputes about fairness of splits
- Delayed settlements
- Manual calculations (Excel, notes, messaging apps)
- Lost receipts
- Lack of reminders
- Internet dependency in existing solutions

Many existing applications:
- Require mandatory sign-up
- Depend heavily on cloud connectivity
- Contain intrusive ads
- Lack flexible split logic

There is a need for a simple, offline-first, fairness-focused solution that prioritizes clarity and transparency.

---

## 5. Value Proposition

FairUp provides:

### 5.1 Flexible Splitting
- Equal split
- Percentage-based split
- Share-based split
- (Future) Item-based split

### 5.2 Clear Accountability
- Real-time balance updates
- Transparent calculation logic
- Per-member debt tracking

### 5.3 Offline-First Design
- No internet required
- No mandatory login
- Local database storage

### 5.4 Intelligent Reminders
- Scheduled reminders for pending balances
- Overdue tracking

### 5.5 Simple User Experience
- Minimal friction
- Clean modern UI
- Fast expense entry

---

### 5.6 Value Flow Diagram

```
User Adds Expense
        ↓
System Calculates Split
        ↓
Member Balances Updated
        ↓
Reminder Scheduled (if needed)
        ↓
Settlement Recorded
        ↓
Group Balance Cleared
```

---

## 6. MVP Scope (Phase 1)

The MVP focuses on core functionality required to ensure fairness and accountability.

### 6.1 Included in MVP

#### Group Management
- Create group
- Add members
- Edit or delete group

#### Expense Management
- Add expense
- Select split type:
  - Equal
  - Percentage
  - Share-based
- Automatic balance calculation

#### Balance Tracking
- Member-wise balance view
- Net group summary

#### Reminder System
- Set reminder date
- Local notification scheduling
- Mark expense as overdue

#### Receipt Capture (Basic)
- Capture receipt image
- Attach image to expense
- Store locally

---

### 6.2 MVP System Boundary

```
+--------------------------------+
|            FairUp              |
|--------------------------------|
|  Group Management              |
|  Expense Engine                |
|  Split Calculation Module      |
|  Reminder Scheduler            |
|  Receipt Storage               |
+--------------------------------+
             |
             v
      Local Room Database
```

---

## 7. Out-of-Scope (Phase 1)

To prevent scope creep and maintain delivery focus, the following are excluded from MVP:

- Cloud synchronization
- Multi-device sync
- User authentication
- Payment gateway integration
- UPI / Stripe integration
- Web application
- Real-time collaboration
- AI recommendations
- Social login
- Data export (PDF/Excel)
- Multi-currency support
- Advanced analytics

These features may be considered in future phases.

---

## 8. Success Metrics

The MVP will be considered successful if:

- A group can be created in under 30 seconds
- An expense can be added in under 20 seconds
- Split calculations are 100% accurate
- Reminder notifications trigger correctly
- No data loss occurs on app restart
- App works fully offline

---

## 9. Future Vision

Future enhancements may include:

- Cloud backend integration
- Multi-device synchronization
- Payment gateway support
- Settlement optimization algorithms
- Expense insights and analytics
- Cross-platform support

---
