package com.uits.roomdatabase.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
class Contact {
    private val firstName: String? = null
    private val lastName: String? = null
    @PrimaryKey
    private val phoneNumber: String = ""
}