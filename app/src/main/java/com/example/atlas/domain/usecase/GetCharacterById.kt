package com.example.atlas.domain.usecase

import com.example.atlas.domain.repository.CharacterRepository
import javax.inject.Inject

class GetCharacterById @Inject constructor(
    private val repo: CharacterRepository
) {
    suspend operator fun invoke(id: Int) = repo.getCharacterById(id)
}
