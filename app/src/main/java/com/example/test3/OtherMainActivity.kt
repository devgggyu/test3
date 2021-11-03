package com.example.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other_main.*

class OtherMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_main)

        okBtn.setOnClickListener {

            val inputNewphoneNum = newphoneNumEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("phonenum", inputNewphoneNum)
            setResult(RESULT_OK, resultIntent)
            finish()



        }






    }
}