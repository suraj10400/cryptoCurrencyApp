package com.example.cryptocurrencyapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TagsItem(

	@field:SerializedName("coin_counter")
	val coinCounter: Int,

	@field:SerializedName("ico_counter")
	val icoCounter: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: String
)