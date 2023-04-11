package com.deverline.splitprice.home.domain.usecases

import com.deverline.splitprice.home.domain.GroupRepository
import com.deverline.splitprice.home.domain.model.Group
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class AddGroupUseCase(
    private val repository: GroupRepository,
) {
    operator fun invoke(group: Group): Flow<Unit> = flow {
        repository.addGroup(group)
    }
}