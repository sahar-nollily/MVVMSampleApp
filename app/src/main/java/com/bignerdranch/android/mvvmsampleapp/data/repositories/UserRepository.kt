package com.bignerdranch.android.mvvmsampleapp.data.repositories

import com.bignerdranch.android.mvvmsampleapp.data.network.MyApi
import com.bignerdranch.android.mvvmsampleapp.data.network.response.AuthResponses
import retrofit2.Response

class UserRepository {
    suspend fun userLogin(email: String , password: String) : Response<AuthResponses> {
        return MyApi().userLogin(email, password)
    }
}