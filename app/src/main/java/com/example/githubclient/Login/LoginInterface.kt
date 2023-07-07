package com.example.githubclient.Login

import moxy.MvpView

import moxy.viewstate.strategy.alias.AddToEnd

@AddToEnd
interface LoginInterface: MvpView{

    fun getLogin() {}

    fun startRepoActivity(){}

    fun loginToModel()

    fun showError()
}