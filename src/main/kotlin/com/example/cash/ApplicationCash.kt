package com.example.cash

object ApplicationCash {
    var requestsAmount = 0
        private set

    fun updateRequestsAmount() {
        requestsAmount++
    }
}