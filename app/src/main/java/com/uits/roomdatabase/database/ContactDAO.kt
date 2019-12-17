package com.uits.roomdatabase.database

import androidx.room.*
import com.uits.roomdatabase.model.Contact

@Dao
public interface ContactDAO {
    @Insert
    fun insert(vararg contacts: Contact?)

    @Update
    fun update(vararg contacts: Contact?)

    @Delete
    fun delete(contact: Contact?)

    @Query("SELECT * FROM contact")
    fun getContacts(): List<Contact?>?

    @Query("SELECT * FROM contact WHERE phoneNumber = :number")
    fun getContactWithId(number: String?): Contact?
}