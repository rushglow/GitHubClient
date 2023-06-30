package com.example.githubclient.Login

import android.widget.Toast
import com.example.githubclient.Model.Model
import com.example.githubclient.R
import com.example.githubclient.databinding.ActivityLoginBinding
import moxy.InjectViewState
import moxy.MvpPresenter
import javax.sql.StatementEvent

@InjectViewState
class LoginPresenter: MvpPresenter<LoginInterface>() {
    lateinit var binding:ActivityLoginBinding
    fun getLogin(){
        binding = ActivityLoginBinding.inflate()
        var login = binding.tokenEt.text
    }
}