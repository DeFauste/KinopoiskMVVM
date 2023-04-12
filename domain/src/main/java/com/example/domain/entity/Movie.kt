package com.example.domain.entity

data class Movie(
    val id: Int,
    val name: String,
    val altName: String,
    val votes: Votes,
    val movieLength: Int,
    val posterUrl: String,
    val posterPreviewUrl: String,
    val ageRating: Int,
    val trailer: String,
    val countryPrem: String,
    val country: String,
    val year: String,
    val description: String,

)

data class Votes(
    val await: Int,
    val filmCritics: Int,
    val imdb: Int,
    val kp: Int,
    val russianFilmCritics: Int
)

