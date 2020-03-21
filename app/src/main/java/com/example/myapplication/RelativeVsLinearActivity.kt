package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative_layout.*

class RelativeVsLinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_vs_linear)

        val user = intent.extras?.getString("user")
        val password = intent.extras?.getString("password")
        et_Usuario.setText(user)
        et_PassWord.setText(password)
    }
}
