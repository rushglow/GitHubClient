package com.example.githubclient.repositories

import android.widget.Toast
import com.example.githubclient.login.LoginActivity
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class RepoPresenter: MvpPresenter<RepoInterface>() {
    lateinit var logActivity: LoginActivity
    fun getRepositories(repositories: List<Repositories>){
        if (repositories.get(0).message != null){
            Toast.makeText(logActivity,"Неверный логин", Toast.LENGTH_LONG).show()
        }else{

            viewState.init()
        }
    }
    fun init(){

    }
}