package com.example.data.remote.entity.response

import com.example.domain.entity.Movie
import com.example.domain.entity.Votes

data class ResponsesMovie(
    val docs: List<Doc>,
    val limit: Int,
    val page: Int,
    val pages: Int,
    val total: Int
)

fun Doc.toDomain() = Movie(
    id = id,
    name = name,
    altName = alternativeName,
    votes = Votes(votes.await, votes.filmCritics, votes.imdb, votes.kp, votes.russianFilmCritics),
    movieLength = movieLength,
    posterUrl = poster.url,
    posterPreviewUrl = poster.previewUrl,
    ageRating = ageRating,
    trailer = videos.trailers[0].url,
    countryPrem = premiere.country,
    country = countries[0].name,
    year = year.toString(),
    description = description
)