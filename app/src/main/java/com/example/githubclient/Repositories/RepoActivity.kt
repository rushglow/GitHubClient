package com.example.githubclient.Repositories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githubclient.Login.LoginActivity
import com.example.githubclient.R
import com.example.githubclient.databinding.ActivityRepoBinding

class RepoActivity : AppCompatActivity() {
    lateinit var binding: ActivityRepoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repo)
    }
}