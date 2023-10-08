package com.example.githubclient.repositories

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubclient.R
import com.example.githubclient.databinding.RepoItemBinding

class RepoItemAdapter ():RecyclerView.Adapter<RepoItemAdapter.RepoItemViewHolder>() {

    private val item = mutableListOf<Repositories>()
    class RepoItemViewHolder(item: View): RecyclerView.ViewHolder(item){
        val binding = RepoItemBinding.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.repo_item, parent, false)
        return RepoItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RepoItemViewHolder, position: Int) {
        holder.binding.nameTv.text= item[position].name
        holder.binding.branchCountTv.text = item[position].forks_count.toString()
        holder.binding.stargazeCountTv.text= item[position].stargazers_count.toString()
        holder.binding.updateTv.text= item[position].updated_at
        holder.binding.langTv.text= item[position].language
        holder.binding.descriptionTv.text= item[position].description

    }

    override fun getItemCount(): Int = item.size

    @SuppressLint("NotifyDataSetChanged")
    fun setChange(repos: List<Repositories>) {
        item.clear()
        item.addAll(repos)
        notifyDataSetChanged()
    }


}