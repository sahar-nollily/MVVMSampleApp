package com.bignerdranch.android.mvvmsampleapp.ui.auth

import androidx.lifecycle.LiveData
import com.bignerdranch.android.mvvmsampleapp.data.db.entities.User

interface AuthListener{
    fun onStarted()
    fun onSuccess(user: User)
    fun onFailure(message: String)
}