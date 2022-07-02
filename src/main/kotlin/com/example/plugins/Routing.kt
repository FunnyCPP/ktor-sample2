package com.example.plugins

import com.example.cash.ApplicationCash
import com.example.feature.drinks.model.Drink
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        get("/") {
            ApplicationCash.updateRequestsAmount()
            call.respond(Drink("Margaritta", "${ApplicationCash.requestsAmount}"))
        }
    }
}
