package com.sachin.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.userLogin() {

    get ("/user")
    {
        call.respond(
            HttpStatusCode.OK,
            mapOf("name" to "Sachin", "Age" to "23","Number" to "6203205636")
        )
    }

}