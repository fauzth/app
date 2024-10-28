package com.example.project_uts_android_ruangbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class LoginSection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_section)


        val backBtn = findViewById<ImageView>(R.id.back)
        val registNow = findViewById<TextView>(R.id.registNow)


        backBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        registNow.setOnClickListener{
            val intent = Intent(this, RegisterSection::class.java)
            startActivity(intent)
        }
    }
}