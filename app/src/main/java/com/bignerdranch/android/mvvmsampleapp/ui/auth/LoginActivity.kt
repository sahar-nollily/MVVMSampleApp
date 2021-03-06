package com.bignerdranch.android.mvvmsampleapp.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bignerdranch.android.mvvmsampleapp.R
import com.bignerdranch.android.mvvmsampleapp.data.db.entities.User
import com.bignerdranch.android.mvvmsampleapp.databinding.ActivityLoginBinding
import com.bignerdranch.android.mvvmsampleapp.util.hide
import com.bignerdranch.android.mvvmsampleapp.util.show
import com.bignerdranch.android.mvvmsampleapp.util.toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), AuthListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)

        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.authListener = this

    }

    override fun onStarted() {
        progress_bar.show()
    }

    override fun onSuccess(user: User) {
        progress_bar.hide()
        toast("${user.name} is Logged In ")
    }

    override fun onFailure(message: String ) {
        progress_bar.hide()
        toast(message)
    }
}