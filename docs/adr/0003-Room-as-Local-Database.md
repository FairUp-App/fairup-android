### ADR-0003: Room as Local Database

**Status:** Accepted

**Date:** 2026-02-16

**Context:**

Need local persistence with:

* Relational structure
* Query validation
* Migration support

**Decision:**

Use **Room** as the local persistence layer.

**Alternatives Considered:**

* SQLite directly
* DataStore
* Realm

**Consequences:**

**Positive:**

* Compile-time SQL validation
* Type-safe
* Official Android support

**Negative:**

* DAO boilerplate
* Migration management required

---

**Document Owner:** Sara

**Technical Reviewer:** Mentor

**Status:** Active