package com.example.mypro.DataBase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class DealerDetails(
    @PrimaryKey(autoGenerate = true)
    var id:Int=0,

    var Name:String?="",
    var Contact:Int?=0,
    var Milktype:String?=""

)
