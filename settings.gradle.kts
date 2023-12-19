rootProject.name = "renovate-gradle-version-catalog-demo"

apply(from = "buildSrc/settings.gradle.kts")

include(
    "serviceA",
    "serviceB"
)