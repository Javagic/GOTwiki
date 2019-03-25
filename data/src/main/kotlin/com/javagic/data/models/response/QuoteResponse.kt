package com.javagic.data.models.response

import com.google.gson.annotations.SerializedName

class QuoteResponse(
    @SerializedName("quote") val message: String,
    @SerializedName("character") val character: String
)