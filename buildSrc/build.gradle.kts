@file:Suppress("UnstableApiUsage", "RemoveRedundantBackticks")

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

allprojects {
    repositories {
        mavenCentral()
    }
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf(
                "-progressive",
                "-Xjvm-default=all",
                "-Xinline-classes"
            )
            jvmTarget = "17"
        }
    }
}
