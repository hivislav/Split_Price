package com.deverline.splitprice.home.data.database.model

import androidx.room.Embedded
import androidx.room.Relation

data class GroupWithMembersAndExpenses(
    @Embedded val group: GroupDbModel,
    @Relation(
        entity = MemberDbModel::class,
        parentColumn = GROUP_ID_COLUMN_NAME,
        entityColumn = GROUP_CREATOR_ID_COLUMN_NAME
    )
    val members: List<MembersWithExpenses>
) {
    companion object {
        const val GROUP_ID_COLUMN_NAME = "group_id"
        const val GROUP_CREATOR_ID_COLUMN_NAME = "group_creator_id"
        const val MEMBER_ID_COLUMN_NAME = "member_id"
        const val EXPENSE_ID_COLUMN_NAME = "expense_id"
    }
}
