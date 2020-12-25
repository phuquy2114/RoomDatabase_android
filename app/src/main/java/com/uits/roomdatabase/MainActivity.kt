package com.uits.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.uits.roomdatabase.database.entities.Contact
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(
            this@MainActivity,
            ViewModelProvider.AndroidViewModelFactory(application)
        ).get(MainViewModel::class.java)

        mainViewModel.allContacts.observe(this, Observer { list ->
            list.forEach {
               print(it.firstName)
               print(it.lastName)
               print(it.phoneNumber)
           }
        })

        mBtnInsert.setOnClickListener {
            val contact = Contact()
            contact.firstName = "Do Phu"
            contact.lastName = "Quy"
            contact.phoneNumber = "0935 366 008"
            mainViewModel.insert(contact)
        }

        mBtnGetAll.setOnClickListener {
            print(mainViewModel.allContacts)

            Log.d("TAG", mainViewModel.allContacts.value.toString() )
        }
    }
}
