package com.example.githubclient.Model

import com.example.githubclient.Login.LoginPresenter
import com.example.githubclient.Repositories.RepoPresenter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.coroutines.suspendCoroutine

class Model {
    lateinit var repoPresenter: RepoPresenter
    lateinit var loginPresenter: LoginPresenter
    fun setLoginToken(loginToken:String){
        val BASE_URL = "https://api.github.com"
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val repoApi = retrofit.create(GithubApi::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            var repositories = repoApi.getRepositories(loginToken)

            repoPresenter.getRepositories(repositories)
        }
        loginPresenter.startRepoActivity()
    }


}