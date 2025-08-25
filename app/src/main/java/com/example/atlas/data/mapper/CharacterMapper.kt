package com.example.atlas.data.mapper

import com.example.atlas.data.local.entity.CharacterEntity
import com.example.atlas.data.remote.dto.CharacterDto
import com.example.atlas.domain.model.Character

fun CharacterDto.toEntity() = CharacterEntity(
    id, name, status, species, image, gender
)

fun CharacterEntity.toDomain() = Character(
    id, name, status, species, image, gender
)
