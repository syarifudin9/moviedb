package com.example.moviedb.service

import com.example.moviedb.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=c266108d657bb80ec7e7fcada194010d")
    fun getMovieList(): Call<MovieResponse>
}