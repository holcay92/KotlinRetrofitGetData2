package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val quotes = InstanceForRt.getInstance().create(ApiInterface::class.java)

        GlobalScope.launch {
            val response = quotes.getProducts()
            if (response.isSuccessful) {
                Log.d("RESPONSE", response.body().toString())
            }
        }
    }
}
