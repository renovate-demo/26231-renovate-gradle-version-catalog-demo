plugins {
	application
	alias(catalog.plugins.kotlin.plugin.serialization)
}

dependencies {
	implementation(catalog.kotlinx.serialization.json)
}