package com.bignerdranch.android.mvvmsampleapp.data.network.response

import com.bignerdranch.android.mvvmsampleapp.data.db.entities.User

data class AuthResponses(
    val isSuccessful : Boolean?,
    val message: String?,
    val user: User?
)