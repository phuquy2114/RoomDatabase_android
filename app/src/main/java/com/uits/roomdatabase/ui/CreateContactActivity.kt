package com.uits.roomdatabase.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.uits.roomdatabase.R
import kotlinx.android.synthetic.main.activity_create_contact.*

/**
 * Create Contact Activity
 *
 * Copyright © 2019 UITS CO.,LTD
 * Created PHUQUY on 7/9/20.
 **/
class CreateContactActivity : AppCompatActivity() {

    companion object {
        const val KEY_EXTRA_REPLY = "com.uits.roomdatabase.ui.wordlistsql.REPLY"
    }

    private lateinit var createContactViewModel: CreateContactViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_contact)

        createContactViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application)).get(CreateContactViewModel::class.java)

        mBtnInsert.setOnClickListener {

        }
    }
}