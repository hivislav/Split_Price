package com.deverline.splitprice.home.domain.usecases

import com.deverline.splitprice.home.domain.GroupRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DeleteGroupUseCase(
    private val repository: GroupRepository,
) {
    operator fun invoke(groupId: Long): Flow<Unit> = flow {
        repository.deleteGroup(groupId)
    }
}