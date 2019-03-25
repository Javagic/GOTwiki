package com.javagic.data.datasource.network

import com.javagic.gotwiki.models.network.request.CharacterRequest
import com.javagic.gotwiki.models.network.response.CharacterResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ThronesApi {
    @GET("/api/characters/")
    fun characterList(): Single<List<CharacterResponse>>

    @POST("/api/characters/find")
    fun findCharacters(@Body request: CharacterRequest): Single<CharacterResponse>

}