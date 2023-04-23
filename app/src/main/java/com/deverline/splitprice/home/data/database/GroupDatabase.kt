package com.deverline.splitprice.home.data.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.deverline.splitprice.home.data.database.model.ExpenseDbModel
import com.deverline.splitprice.home.data.database.model.GroupDbModel
import com.deverline.splitprice.home.data.database.model.MemberDbModel
import com.deverline.splitprice.home.data.database.model.MemberExpenseCrossRef

@Database(
    entities = [
        GroupDbModel::class,
        MemberDbModel::class,
        ExpenseDbModel::class,
        MemberExpenseCrossRef::class
               ],
    version = 1,
    exportSchema = false
)
abstract class GroupDatabase : RoomDatabase() {
    companion object {

        private var INSTANCE: GroupDatabase? = null
        private const val DB_NAME = "group.db"
        private val LOCK = Any()

        fun getInstance(application: Application): GroupDatabase {
            INSTANCE?.let {
                return it
            }
            synchronized(LOCK) {
                INSTANCE?.let {
                    return it
                }
                val db = Room.databaseBuilder(
                    application,
                    GroupDatabase::class.java,
                    DB_NAME
                )
                    .build()
                INSTANCE = db
                return db
            }
        }
    }

    abstract fun groupDao(): GroupDao
}