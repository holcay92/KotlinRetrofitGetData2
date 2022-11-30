package com.example.myapplication2

data class Phone(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)