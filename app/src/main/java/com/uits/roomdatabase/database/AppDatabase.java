package com.uits.roomdatabase.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.uits.roomdatabase.model.Contact;

@Database(entities = {Contact.class}, version = 1)
@TypeConverters({DateTypeConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract ContactDAO getContactDAO();
}