package com.example.githubclient.Repositories

data class Repositories(
    var name: String? = null,
    var update: String? = null,
    var description: String? = null,
    var stars: Int? = null,
    var lang: String? = null,
    var branches: Int? = null
)