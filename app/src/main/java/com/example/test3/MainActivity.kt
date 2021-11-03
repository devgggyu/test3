package com.example.test3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_PHONE_NUM =1005
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeBtn.setOnClickListener {
            val myIntent = Intent(this, OtherMainActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_PHONE_NUM)
        }
    }
}