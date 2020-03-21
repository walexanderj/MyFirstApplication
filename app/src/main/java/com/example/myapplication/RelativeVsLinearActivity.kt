package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_relative_layout.*
import kotlinx.android.synthetic.main.activity_relative_layout.et_PassWord
import kotlinx.android.synthetic.main.activity_relative_vs_linear.*

class RelativeVsLinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_vs_linear)

        val user = intent.getStringExtra("user")
        val password = intent.getStringExtra("password")

        et_Nombre.setText(user)
        et_PassWord.setText(password)
    }
}
