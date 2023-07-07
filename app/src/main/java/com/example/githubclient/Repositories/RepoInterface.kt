package com.example.githubclient.Repositories

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEnd

@AddToEnd
interface RepoInterface:MvpView {
    fun init()
}