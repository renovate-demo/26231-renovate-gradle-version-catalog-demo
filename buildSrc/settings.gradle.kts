rootProject.name = "buildSrc"

dependencyResolutionManagement {
    versionCatalogs {
        create("catalog") {
            version("kotlin", "1.9.20").also {
                plugin("kotlin-jvm", "org.jetbrains.kotlin.jvm").versionRef(it)
                plugin("kotlin-plugin-serialization", "org.jetbrains.kotlin.plugin.serialization").versionRef(it)
                library("kotlin-reflect", "org.jetbrains.kotlin", "kotlin-reflect").versionRef(it)
            }

            plugin("ktlint", "org.jlleitschuh.gradle.ktlint").version("11.6.1")

            library("kotlinx-serialization-json", "org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
        }
    }
}
