package com.example.data.remote.repository.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://api.kinopoisk.dev/v1/"
const val TOKEN_API = "C2YM9N6-ECGMM50-GFAA00K-Y7FSNBQ"

object MoviesRetrofitClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiMovies: ApiServiceMovies by lazy {
        retrofit
            .create(ApiServiceMovies::class.java)
    }
}