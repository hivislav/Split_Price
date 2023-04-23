package com.deverline.splitprice.home.data.database

import androidx.room.*
import com.deverline.splitprice.home.data.database.model.GroupDbModel
import com.deverline.splitprice.home.data.database.model.GroupDbModel.Companion.GROUP_TABLE_NAME
import com.deverline.splitprice.home.data.database.model.GroupWithMembersAndExpenses
import com.deverline.splitprice.home.data.database.model.MemberDbModel
import kotlinx.coroutines.flow.Flow

@Dao
interface GroupDao {
    @Transaction
    @Query("SELECT * FROM $GROUP_TABLE_NAME")
    fun getAllGroups(): Flow<List<GroupWithMembersAndExpenses>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addGroup(groupDbModel: GroupDbModel, memberDbModelList: List<MemberDbModel>)
}