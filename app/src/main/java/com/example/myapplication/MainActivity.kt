package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        new_list_btn_guest.setOnClickListener{
            val intent = Intent(this, GroceryList::class.java)

            startActivityForResult(intent, REQUEST_CODE)
        }

        sign_in_btn.setOnClickListener{
            val intent = Intent(this, SignIn::class.java)

            startActivityForResult(intent, REQUEST_CODE)
        }

        sign_up_btn.setOnClickListener{
            val intent = Intent(this, SignUp::class.java)

            startActivityForResult(intent, REQUEST_CODE)
        }


    }
    companion object {
        const val RESPOND_CODE = 1
        const val REQUEST_CODE = 1
    }
}