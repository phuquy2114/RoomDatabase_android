package com.uits.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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


        mBtnInsert.setOnClickListener {
            val contact = Contact()
            contact.firstName = "Do Phu"
            contact.lastName = "Quy"
            contact.phoneNumber = "0935 366 007"
            mainViewModel.insert(contact)
        }
    }
}
