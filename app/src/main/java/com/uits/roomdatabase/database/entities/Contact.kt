package com.uits.roomdatabase.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class Contact {

    @PrimaryKey
    @ColumnInfo(name = "phoneNumber")
    var phoneNumber: String = ""

    @ColumnInfo(name = "firstName")
    var firstName: String? = null

    @ColumnInfo(name = "lastName")
    var lastName: String? = null

}