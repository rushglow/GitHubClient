package com.example.githubclient.login

import com.example.githubclient.Model.Model
import com.example.githubclient.databinding.ActivityLoginBinding
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class LoginPresenter: MvpPresenter<LoginInterface>() {

    lateinit var binding:ActivityLoginBinding
    lateinit var model:Model
    lateinit var login:String

    fun getLogin(){
        if (binding.tokenEt.text.isNotEmpty())
        {
            viewState.getLogin()
        }else{
            viewState.showError()
        }

    }

    fun loginToModel(){
        model.setLoginToken(login)

    }

    fun startRepoActivity() {
        viewState.startRepoActivity()
    }

}