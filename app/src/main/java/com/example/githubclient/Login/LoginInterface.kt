package com.example.githubclient.Login

import moxy.MvpView

interface LoginInterface: MvpView{
    fun getLogin() {}

    fun startRepoActivity(){}

    fun tokenToModel()
}