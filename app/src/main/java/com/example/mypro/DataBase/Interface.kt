package com.example.mypro.DataBase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao

interface Interface {
    @Insert
fun InsertTODO(todo:DealerDetails)


@Query("SELECT*FROM DEALERDETAILS")
fun GetList():List<DealerDetails>

@Update
fun Update(dealerDetails: DealerDetails)

@Delete
fun Delete(dealerDetails: DealerDetails)

}