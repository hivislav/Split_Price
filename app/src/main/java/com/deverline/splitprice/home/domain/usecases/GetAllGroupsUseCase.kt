package com.deverline.splitprice.home.domain.usecases

import com.deverline.splitprice.home.domain.GroupRepository
import com.deverline.splitprice.home.domain.model.Group
import kotlinx.coroutines.flow.Flow

class GetAllGroupsUseCase(
    private val repository: GroupRepository
) {
    operator fun invoke(): Flow<List<Group>> = repository.getAllGroups()
}