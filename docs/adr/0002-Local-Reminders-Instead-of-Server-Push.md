### ADR-0002: Local Reminders Instead of Server Push

**Status:** Accepted

**Date:** 2026-02-16

**Context:**

* Offline-first requirement
* Reminder notifications for tasks

**Decision:**

Use **local device reminders** with WorkManager.

**Alternatives Considered:**

* Server push notifications (FCM)

**Consequences:**

**Positive:**

* Works offline
* No backend dependency

**Negative:**

* Single-device limitation
* No cross-device sync

---

**Document Owner:** Sara

**Technical Reviewer:** Mentor

**Status:** Active

---

