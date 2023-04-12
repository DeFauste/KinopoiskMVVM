package com.example.data.remote

import com.example.data.remote.entity.response.toDomain
import com.example.data.remote.repository.remote.MoviesRetrofitClient
import com.example.domain.entity.Movie
import com.example.domain.repository.Repository

class TestClass: Repository {

    override suspend fun getMovie(page: Int, limit: Int, id: String, year: String, type: String): ArrayList<Movie> {
        val movieList = arrayListOf<Movie>()
        MoviesRetrofitClient.apiMovies.get(page,limit,id,year,type).apply {
            if(this.isSuccessful) {
                body()?.docs?.forEach { movie ->
                    movieList.add(movie.toDomain())
                }
            }
        }
        return movieList
    }

}