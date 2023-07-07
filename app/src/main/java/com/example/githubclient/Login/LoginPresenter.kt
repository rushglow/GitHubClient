package com.example.githubclient.Login

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.githubclient.Model.Model
import com.example.githubclient.R
import com.example.githubclient.Repositories.RepoActivity
import com.example.githubclient.databinding.ActivityLoginBinding
import moxy.InjectViewState
import moxy.MvpPresenter
import javax.sql.StatementEvent

@InjectViewState
class LoginPresenter: MvpPresenter<LoginInterface>() {

    lateinit var binding:ActivityLoginBinding
    lateinit var model:Model

    var login = ""

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