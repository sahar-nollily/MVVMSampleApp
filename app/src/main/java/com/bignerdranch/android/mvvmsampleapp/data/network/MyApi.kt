package com.bignerdranch.android.mvvmsampleapp.data.network


import com.bignerdranch.android.mvvmsampleapp.data.network.response.AuthResponses
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MyApi {
    @FormUrlEncoded
    @POST("login")
       suspend fun userLogin(
           @Field("email") email: String,
           @Field("password") password: String
       ): Response<AuthResponses>


    companion object{
        operator fun invoke():MyApi{
            return Retrofit.Builder().baseUrl("https://simplifiedcoding.tech/mywebapp/public/api/auth/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MyApi::class.java)
        }
    }
}