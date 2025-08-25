package com.example.atlas.data.remote.api

import com.example.atlas.data.remote.dto.CharacterDto
import com.example.atlas.data.remote.dto.CharacterPageDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RickMortyApi {
    @GET("character")
    suspend fun getCharacters(@Query("page") page: Int): CharacterPageDto

    @GET("character/{id}")
    suspend fun getCharacterById(@Path("id") id: Int): CharacterDto
}
