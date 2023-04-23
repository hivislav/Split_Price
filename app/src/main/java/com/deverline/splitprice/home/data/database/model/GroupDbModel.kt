package com.deverline.splitprice.home.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.deverline.splitprice.home.data.database.model.GroupDbModel.Companion.GROUP_TABLE_NAME
import com.deverline.splitprice.home.data.database.model.GroupWithMembersAndExpenses.Companion.GROUP_ID_COLUMN_NAME

@Entity(tableName = GROUP_TABLE_NAME)
data class GroupDbModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = GROUP_ID_COLUMN_NAME)
    var id: Long = 0,
    val name: String
) {
    companion object {
        const val GROUP_TABLE_NAME = "group_table"
    }
}
