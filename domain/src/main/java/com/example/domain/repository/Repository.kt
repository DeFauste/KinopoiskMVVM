package com.example.domain.repository

import com.example.domain.entity.Movie

interface Repository {
    suspend fun getMovie(
        page: Int = 1,
        limit: Int = 10,
         id: String = "",
        year: String = "1860-2023",
        type: String = "",
    ) : ArrayList<Movie>
}