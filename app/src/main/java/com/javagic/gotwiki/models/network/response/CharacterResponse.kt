package com.javagic.gotwiki.models.network.response

import com.google.gson.annotations.SerializedName

class CharacterResponse(
    @SerializedName("_id") val id: String,
    @SerializedName("imageLink") val imageLink: String,
    @SerializedName("dateOfBirth") val dateOfBirth: Int,
    @SerializedName("male") val male: Boolean,
    @SerializedName("spouse") val spouse: Boolean,
    @SerializedName("culture") val culture: String,
    @SerializedName("dateOfDeath") val dateOfDeath: Int,
    @SerializedName("house") val house: String,
    @SerializedName("slug") val slug: String,
    @SerializedName("name") val name: String,
    @SerializedName("__v") val __v: Int,
    @SerializedName("pageRank") val pageRank: Int,
    @SerializedName("books") val books: List<String>,
    @SerializedName("updatedAt") val updatedAt: String,
    @SerializedName("createdAt") val createdAt: String,
    @SerializedName("titles") val titles: List<String>
)