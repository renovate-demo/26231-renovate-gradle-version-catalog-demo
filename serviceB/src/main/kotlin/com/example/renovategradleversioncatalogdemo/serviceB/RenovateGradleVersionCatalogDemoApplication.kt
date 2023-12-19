package com.example.renovategradleversioncatalogdemo.serviceB

import kotlin.reflect.KFunction

fun main(args: Array<String>) {
    bar(::foo)
}

fun foo() {}

fun bar(function: KFunction<Any>) {
    println(function.name)
}