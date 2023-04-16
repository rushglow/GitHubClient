package com.example.githubclient.Model

import android.service.autofill.UserData
import com.example.githubclient.Repositories.Repositories
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface GithubApi {
    @GET("/users/{username}/repos")
    suspend fun getRepositories(@Path("username") username: String): List<Repositories>
}