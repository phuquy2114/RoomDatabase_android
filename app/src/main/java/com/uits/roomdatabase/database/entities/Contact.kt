package com.uits.roomdatabase.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class Contact(
    var firstName: String? = null,

    var lastName: String? = null,

    @PrimaryKey
    var phoneNumber: String = ""
)

