package com.example.d_place

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST

private val retrofit= Retrofit.Builder().baseUrl("http://10.0.2.2:5000/").addConverterFactory(
    GsonConverterFactory.create()).build()
val Client= retrofit.create(ApiService::class.java)

interface ApiService{
//    @POST("/add")
//    suspend fun adDetails(@Body)
}