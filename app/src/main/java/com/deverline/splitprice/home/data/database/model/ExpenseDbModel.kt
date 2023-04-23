package com.deverline.splitprice.home.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.deverline.splitprice.home.data.database.model.ExpenseDbModel.Companion.EXPENSES_TABLE_NAME
import com.deverline.splitprice.home.data.database.model.GroupWithMembersAndExpenses.Companion.EXPENSE_ID_COLUMN_NAME

@Entity(tableName = EXPENSES_TABLE_NAME)
data class ExpenseDbModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = EXPENSE_ID_COLUMN_NAME)
    var id: Long = 0,
    val name: String,
    val sumExpense: Int
) {
    companion object {
        const val EXPENSES_TABLE_NAME = "expenses_table"
    }
}
