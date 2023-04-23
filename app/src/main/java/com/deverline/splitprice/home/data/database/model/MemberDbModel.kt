package com.deverline.splitprice.home.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.deverline.splitprice.home.data.database.model.GroupWithMembersAndExpenses.Companion.GROUP_CREATOR_ID_COLUMN_NAME
import com.deverline.splitprice.home.data.database.model.GroupWithMembersAndExpenses.Companion.MEMBER_ID_COLUMN_NAME
import com.deverline.splitprice.home.data.database.model.MemberDbModel.Companion.MEMBERS_TABLE_NAME

@Entity(tableName = MEMBERS_TABLE_NAME)
data class MemberDbModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = MEMBER_ID_COLUMN_NAME)
    var id: Long = 0,
    @ColumnInfo(name = GROUP_CREATOR_ID_COLUMN_NAME)
    val groupCreatorId: Long,
    val name: String,
    val credit: Int
) {
    companion object {
        const val MEMBERS_TABLE_NAME = "members_table"
    }
}