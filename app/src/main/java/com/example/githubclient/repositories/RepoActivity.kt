package com.example.githubclient.repositories

import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.githubclient.R
import com.example.githubclient.databinding.ActivityRepoBinding
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class RepoActivity : MvpAppCompatActivity(R.layout.activity_repo), RepoInterface {
    lateinit var binding: ActivityRepoBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RepoItemAdapter

    @InjectPresenter
    lateinit var repoPresenter: RepoPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repo)

    }

    override fun onResume() {
        super.onResume()
    }

    override fun init() {
        recyclerView = binding.repoRecycler
        adapter = RepoItemAdapter()
        recyclerView.adapter = adapter

    }


}