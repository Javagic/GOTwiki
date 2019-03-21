package com.javagic.gotwiki.domain

import com.javagic.gotwiki.models.model.Character
import com.javagic.gotwiki.models.network.request.CharacterRequest
import io.reactivex.Single


interface ThronesRepository {
    fun characterList(): Single<List<Character>>
    fun findCharacters(request: CharacterRequest): Single<Character>
}