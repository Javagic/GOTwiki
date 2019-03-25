package com.javagic.data.models.request

import com.google.gson.annotations.SerializedName

class CharacterRequest(
    @SerializedName("_id") val id: String,
    @SerializedName("dateOfBirth") val dateOfBirth: String,
    @SerializedName("male") val male: Boolean,
    @SerializedName("house") val house: String,
    @SerializedName("slug") val slug: String,
    @SerializedName("name") val name: String,
    @SerializedName("updatedAt") val updatedAt: String,
    @SerializedName("createdAt") val createdAt: String
)