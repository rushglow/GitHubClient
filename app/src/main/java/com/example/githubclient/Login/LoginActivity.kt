package com.example.githubclient.Login

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.githubclient.R
import com.example.githubclient.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), LoginInterface {

    override lateinit var binding: ActivityLoginBinding
    lateinit var presenter: LoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding.singInBtn.setOnClickListener {
        }
    }

}