package com.example.githubclient.Login

import com.example.githubclient.databinding.ActivityLoginBinding

class LoginPresenter  {
    lateinit var activityToken: String
    lateinit var binding: ActivityLoginBinding

    var a = LoginInterface.getToken()
}