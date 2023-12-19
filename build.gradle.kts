import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jlleitschuh.gradle.ktlint.KtlintPlugin

plugins {
    base
    idea

    alias(catalog.plugins.kotlin.jvm) apply false
    alias(catalog.plugins.ktlint)
}

allprojects {
    repositories {
        mavenCentral()
    }

    apply<KtlintPlugin>()

    version = "latest"
}

subprojects {
    apply<KtlintPlugin>()

    plugins.withType<ApplicationPlugin> {
        apply<KotlinPluginWrapper>()
    }

    tasks {
        withType<KotlinCompile> {
            kotlinOptions {
                freeCompilerArgs = listOf(
                    "-progressive",
                    "-Xinline-classes",
                    "-Xjsr305=strict",
                    "-Xjvm-default=all",
                    "-opt-in=kotlin.RequiresOptIn",
                    "-Xcontext-receivers"
                )
                jvmTarget = "17"
                javaParameters = true
            }
        }
    }
}
