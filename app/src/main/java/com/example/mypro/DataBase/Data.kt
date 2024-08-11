package com.example.mypro.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DealerDetails::class], version = 1, exportSchema = true)

abstract class Data():RoomDatabase() {
    abstract fun inter(): Interface

    companion object {
        private var data: Data? = null
        fun getInstance(context: Context): Data {
            if (
                data == null) {
                data = Room.databaseBuilder(
                    context, Data::class.java, "DataBase"
                )
                    .allowMainThreadQueries()
                    .build()
            }
            return data!!
        }

    }
}
