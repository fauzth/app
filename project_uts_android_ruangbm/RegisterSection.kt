package com.example.project_uts_android_ruangbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class RegisterSection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_section)

        val backBtn = findViewById<ImageView>(R.id.back)
        val loginNow = findViewById<TextView>(R.id.loginNow)


        backBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        loginNow.setOnClickListener{
            val intent = Intent(this, LoginSection::class.java)
            startActivity(intent)
        }
    }
}