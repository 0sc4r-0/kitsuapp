package com.example.oscar.kitsu.Views.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {

    companion object {
        const val baseURL = "https://kitsu.io/api/edge/"
        fun getAnimes(): Retrofit {
            val retrofit : Retrofit = Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit
        }
    }
}