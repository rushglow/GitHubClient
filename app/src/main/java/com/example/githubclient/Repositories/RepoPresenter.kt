package com.example.githubclient.Repositories

import android.app.ActivityOptions.makeBasic
import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.githubclient.Login.LoginActivity
import retrofit2.Call

class RepoPresenter {
    lateinit var logActivity: LoginActivity
    fun getRepositories(repositories: List<Repositories>){
        if (repositories.get(0).message != null){
            Toast.makeText(logActivity,"Неверный логин", Toast.LENGTH_LONG).show()
        }else{
            RepoItemAdapter(repositories)
            logActivity.startRepoActivity()
        }
    }
}