package com.example.githubclient.repositories

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType
import moxy.viewstate.strategy.alias.AddToEnd

@StateStrategyType(AddToEndSingleStrategy::class)
interface RepoInterface:MvpView {
    @AddToEnd
    fun init()
}