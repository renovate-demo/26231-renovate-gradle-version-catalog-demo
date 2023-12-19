# Renovate - Gradle Version Catalog demo

This repository serves as a demonstration in order to implement proper Gradle 
[Version Catalog] parsing in [renovate].

See the following discussion in the renovate repository:
https://github.com/renovatebot/renovate/discussions/26231

The most interesting file for this purpose is the [settings.gradle.kts] which 
contains examples for different ways of referencing a version in the Gradle 
Version Catalog.

[Version Catalog]: https://docs.gradle.org/current/userguide/platforms.html
[renovate]: https://github.com/renovatebot/renovate
[settings.gradle.kts]: ./buildSrc/settings.gradle.kts
