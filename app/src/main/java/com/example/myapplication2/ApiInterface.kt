package com.example.myapplication2

import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("users")
    suspend fun getUsers(): Response<User>
}