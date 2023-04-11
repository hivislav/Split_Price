package com.deverline.splitprice.home.domain

import com.deverline.splitprice.home.domain.model.Group
import kotlinx.coroutines.flow.Flow

interface GroupRepository {
    fun addGroup(group: Group)
    fun deleteGroup(groupId: Long)
    fun getAllGroups(): Flow<List<Group>>
    fun getGroup(groupId: Long): Flow<Group>
    fun updateGroup(groupId: Long)
}