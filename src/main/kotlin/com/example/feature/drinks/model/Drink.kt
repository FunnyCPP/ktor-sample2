package com.example.feature.drinks.model

import kotlinx.serialization.Serializable

@Serializable
data class Drink(
    val name: String,
    val description: String,
)
