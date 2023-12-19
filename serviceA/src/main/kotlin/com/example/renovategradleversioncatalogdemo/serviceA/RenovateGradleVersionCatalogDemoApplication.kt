package com.example.renovategradleversioncatalogdemo.serviceA

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main(args: Array<String>) {
    val obj = Data(42, "str")
    val json = Json.encodeToString(obj)
    println(json)
}

@Serializable
data class Data(val a: Int, val b: String)