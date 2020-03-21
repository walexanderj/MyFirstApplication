package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative_layout.*

class RelativeLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        bt_Ingresar.setOnClickListener {view ->
            val myIntent = Intent(this,RelativeVsLinearActivity::class.java)
            myIntent.putExtra("user",et_Usuario.text)
            myIntent.putExtra("password",et_PassWord.text)
            startActivity(myIntent)
        }
    }
}
