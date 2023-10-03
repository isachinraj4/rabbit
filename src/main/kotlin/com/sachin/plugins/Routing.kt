package com.sachin.plugins

import com.sachin.routes.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
//        My ktor tuits
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
//        KTOR from yt
        randomRabbit()
        userLogin()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
