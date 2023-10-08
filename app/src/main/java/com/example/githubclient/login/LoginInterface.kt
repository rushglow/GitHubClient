package com.example.githubclient.login

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

import moxy.viewstate.strategy.alias.AddToEnd

@StateStrategyType(AddToEndSingleStrategy::class)
interface LoginInterface: MvpView{
    @AddToEnd
    fun getLogin() {}
    @AddToEnd
    fun startRepoActivity(){}
    @AddToEnd
    fun loginToModel()
    @AddToEnd
    fun showError()
}