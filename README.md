# matrix-plat-quota-forge

`matrix-plat-quota-forge` is a Java project in platform engineering. Its focus is to package a Java local lab for quota analysis with transition tables, invalid-transition tests, and documented operating limits.

## Why I Keep It Small

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Matrix Plat Quota Forge Review Notes

For a quick review, compare `rollout width` with `rollout width` before reading the middle cases.

## Included Behavior

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/matrix-plat-quota-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `rollout width` and `rollout width`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Internal Model

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The Java addition stays small enough to inspect in one sitting.

## Try It Locally

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Validation

The check exercises the source code and the review fixture. `baseline` is the high score at 209; `stale` is the low score at 143.

## Scope

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
