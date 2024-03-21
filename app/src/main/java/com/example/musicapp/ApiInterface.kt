package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
    @Headers("X-RapidAPI-Key:4dd65ed943msh4ad35af305e7ef5p18ce3cjsn2dc4bb49e5a7",
    "X-RapidAPI-Host:deezerdevs-deezer.p.rapidapi.com")

    @GET("search")
    fun getData(@Query("q") query:String): Call<MyData>
}