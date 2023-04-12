package com.example.data.remote.repository.remote

import androidx.annotation.IntRange
import com.example.data.remote.entity.response.ResponsesMovie

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServiceMovies {
    @GET(
        "movie?" +
                "selectFields=id" +
                "&selectFields=name" +
                "&selectFields=alternativeName" +
                "&selectFields=votes" +
                "&selectFields=movieLength" +
                "&selectFields=poster.url" +
                "&selectFields=ageRating" +
                "&selectFields=videos.trailers.url" +
                "&selectFields=premiere.country" +
                "&selectFields=year" +
                "&sortType=-1" +
                "&selectFields=description" +
                "&selectFields=poster.previewUrl" +
                "&selectFields=countries" +
                "token=$TOKEN_API"
    )
    suspend fun get(
        @Query("page") @IntRange(from = 1) page: Int = 1,
        @Query("limit") @IntRange(from = 1, to = 10) limit: Int = 10,
        @Query("id") id: String = "",
        @Query("year") year: String = "1860-2023",
        @Query("type") type: String = "",
    ): Response<ResponsesMovie>
}