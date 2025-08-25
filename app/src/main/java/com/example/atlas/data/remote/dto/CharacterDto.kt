package com.example.atlas.data.remote.dto

data class CharacterPageDto(
    val info: PageInfoDto,
    val results: List<CharacterDto>
)

data class PageInfoDto(val count: Int, val pages: Int, val next: String?, val prev: String?)

data class CharacterDto(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val image: String,
    val gender: String,
)
