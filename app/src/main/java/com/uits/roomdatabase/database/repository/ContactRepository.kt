package com.uits.roomdatabase.database.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.uits.roomdatabase.database.dao.ContactDAO
import com.uits.roomdatabase.database.entities.Contact

/**
 * Contact Repository
 *
 * Copyright © 2019 UITS CO.,LTD
 * Created PHUQUY on 7/9/20.
 **/

class ContactRepository(var contactDAO: ContactDAO) {

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allContact: LiveData<List<Contact>> = contactDAO.getContacts()

    // You must call this on a non-UI thread or your app will crash. So we're making this a
    // suspend function so the caller methods know this.
    // Like this, Room ensures that you're not doing any long running operations on the main
    // thread, blocking the UI.
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(contact: Contact) {
        contactDAO.insert(contact)
    }
}