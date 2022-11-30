package com.example.myapplication2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object InstanceForRt {

    val BASEURL ="https://dummyjson.com/products"

    fun getInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build()

    }
}