package com.example.data.remote.entity.response

data class Doc(
    val ageRating: Int,
    val alternativeName: String,
    val countries: List<Country>,
    val description: String,
    val id: Int,
    val movieLength: Int,
    val name: String,
    val poster: Poster,
    val premiere: Premiere,
    val videos: Videos,
    val votes: Votes,
    val year: Int
)