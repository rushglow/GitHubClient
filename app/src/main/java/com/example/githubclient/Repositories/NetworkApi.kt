package com.example.githubclient.Repositories

import android.service.autofill.UserData
import retrofit2.http.GET
import retrofit2.http.POST

interface NetworkApi {
    @GET("Github")
    fun getUserInfo():MutableList<UserData>

    @POST("Post token")
    fun postToken():String
}