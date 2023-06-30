package com.example.githubclient.Repositories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.githubclient.Login.LoginActivity
import com.example.githubclient.R
import com.example.githubclient.databinding.ActivityRepoBinding

class RepoActivity : AppCompatActivity() {
    lateinit var binding: ActivityRepoBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RepoItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repo)
    }
}