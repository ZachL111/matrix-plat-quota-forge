# Matrix Plat Quota Forge Walkthrough

I use this file as a small checklist before changing the Java implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | rollout width | 209 | ship |
| stress | quota pressure | 186 | ship |
| edge | route drift | 147 | ship |
| recovery | secret scope | 155 | ship |
| stale | rollout width | 143 | ship |

Start with `baseline` and `stale`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `rollout width` against `rollout width`, not the raw score alone.
