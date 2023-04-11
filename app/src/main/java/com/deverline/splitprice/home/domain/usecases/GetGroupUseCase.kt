package com.deverline.splitprice.home.domain.usecases

import com.deverline.splitprice.home.domain.GroupRepository
import com.deverline.splitprice.home.domain.model.Group
import kotlinx.coroutines.flow.Flow

class GetGroupUseCase(
    private val repository: GroupRepository,
) {
    operator fun invoke(groupId: Long): Flow<Group> = repository.getGroup(groupId)
}