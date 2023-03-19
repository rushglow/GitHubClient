package com.example.githubclient.Login

import com.example.githubclient.databinding.ActivityLoginBinding

interface LoginInterface {
    var binding: ActivityLoginBinding
    fun getToken(): String {
        var token = binding.tokenEt.text.toString()
        return token
    }
}