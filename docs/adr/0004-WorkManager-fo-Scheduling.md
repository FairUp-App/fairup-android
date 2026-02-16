### ADR-0004: WorkManager for Scheduling

**Status:** Accepted

**Date:** 2026-02-16

**Context:**

Need reliable background execution for reminders. Android restricts background tasks.

**Decision:**

Use **WorkManager** for background scheduling.

**Alternatives Considered:**

* AlarmManager
* Foreground Services
* Custom background threads

**Consequences:**

**Positive:**

* Guaranteed execution
* Survives app restarts
* Battery-optimized

**Negative:**

* Slight delay in execution timing
* Requires structured setup

---

### ADR Governance Rules

* All significant decisions require an ADR.
* ADRs are immutable once accepted.
* New ADR required for changes.
* ADRs must include alternatives and consequences.
* PRs impacting architecture must reference an ADR.

---

**Document Owner:** Sara

**Technical Reviewer:** Mentor

**Status:** Active

