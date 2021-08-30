package com.example

import io.ktor.application.*
import java.net.URL

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    println("${URL("https://youtrack.jetbrains.com/")}")
}

