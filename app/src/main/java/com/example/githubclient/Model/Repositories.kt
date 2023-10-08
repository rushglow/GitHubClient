package com.example.githubclient.repositories

data class Repositories(
    var message: String? = null,
    var name: String? = null,
    var stargazers_count: Int? = null,
    var forks_count: Int? = null,
    var language: String? = null,
    var description: String? = null,
    var updated_at: String? = null
)