package com.example.atlas.domain.usecase

import com.example.atlas.domain.repository.CharacterRepository
import javax.inject.Inject

class GetCharactersPaged @Inject constructor(
    private val repo: CharacterRepository
) {
    operator fun invoke(query: String) = repo.charactersPaged(query)
}
