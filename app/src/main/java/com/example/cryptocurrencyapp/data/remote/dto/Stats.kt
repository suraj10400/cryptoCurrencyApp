package com.example.cryptocurrencyapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Stats(

	@field:SerializedName("followers")
	val followers: Int,

	@field:SerializedName("contributors")
	val contributors: Int,

	@field:SerializedName("stars")
	val stars: Int,

	@field:SerializedName("subscribers")
	val subscribers: Int
)