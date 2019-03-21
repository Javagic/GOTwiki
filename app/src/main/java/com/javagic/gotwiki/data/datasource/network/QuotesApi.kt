package com.javagic.gotwiki.data.datasource.network

import com.javagic.gotwiki.models.network.response.QuoteResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesApi {
    @GET("/api/characters/")
    fun quote(): Single<QuoteResponse>

    @GET("/api/characters/")
    fun quote(@Query("character") name: String): Single<QuoteResponse>
}