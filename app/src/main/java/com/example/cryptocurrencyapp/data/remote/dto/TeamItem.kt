package com.example.cryptocurrencyapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TeamItem(

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("id")
    val id: String,

    @field:SerializedName("position")
    val position: String
)