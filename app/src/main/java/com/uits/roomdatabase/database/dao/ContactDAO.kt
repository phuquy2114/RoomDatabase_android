package com.uits.roomdatabase.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.uits.roomdatabase.database.entities.Contact

@Dao
public interface ContactDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(vararg contacts: Contact?)

    @Update
    fun update(vararg contacts: Contact?)

    @Delete
    fun delete(contact: Contact?)

    @Query("SELECT * FROM contact")
    fun getContacts(): LiveData<List<Contact>>

    @Query("SELECT * FROM contact WHERE phoneNumber = :number")
    fun getContactWithId(number: String?): Contact?
}