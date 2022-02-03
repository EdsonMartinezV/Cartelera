package com.example.a293_e37_cartelera

import java.io.Serializable

data class Movie(val name: String,
                 val director: String,
                 var rating: Float,
                 val duration: String,
                 val image: Int,
                 val releaseYear: Int,
                 val description: String) : Serializable
