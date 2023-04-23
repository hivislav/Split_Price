package com.deverline.splitprice.home.data.database.model

import androidx.room.*
import com.deverline.splitprice.home.data.database.model.GroupWithMembersAndExpenses.Companion.EXPENSE_ID_COLUMN_NAME
import com.deverline.splitprice.home.data.database.model.GroupWithMembersAndExpenses.Companion.MEMBER_ID_COLUMN_NAME

data class MembersWithExpenses(
    @Embedded val member: MemberDbModel,
    @Relation(
        parentColumn = MEMBER_ID_COLUMN_NAME,
        entityColumn = EXPENSE_ID_COLUMN_NAME,
        associateBy = Junction(MemberExpenseCrossRef::class)
    )
    val expenses: List<ExpenseDbModel>
)

@Entity(primaryKeys = [MEMBER_ID_COLUMN_NAME, EXPENSE_ID_COLUMN_NAME])
data class MemberExpenseCrossRef(
    @ColumnInfo(name = MEMBER_ID_COLUMN_NAME)
    val memberId: Long,
    @ColumnInfo(name = EXPENSE_ID_COLUMN_NAME)
    val expenseId: Long
)
