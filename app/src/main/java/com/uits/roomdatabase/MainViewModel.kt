package com.uits.roomdatabase

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.uits.roomdatabase.database.AppDatabase
import com.uits.roomdatabase.database.entities.Contact
import com.uits.roomdatabase.database.repository.ContactRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


/**
 * Main ViewModel
 * Copyright © 2019 UITS CO.,LTD
 * Created PHUQUY on 7/8/20.
 **/
class MainViewModel(context: Application) : AndroidViewModel(context) {
    private val contactRepository : ContactRepository

    val allWords: LiveData<List<Contact>>

    init {
        val contactDao = AppDatabase.getDatabase(context).mContactDAO
        contactRepository = ContactRepository(contactDao)
        allWords = contactRepository.allContact
    }


    /**
     * Launching a new coroutine to insert the data in a non-blocking way
     */
    fun insert(contact: Contact) = viewModelScope.launch(Dispatchers.IO) {
        contactRepository.insert(contact)
    }
}