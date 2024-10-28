package com.example.project_uts_android_ruangbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home3)

        val gradeBtn = findViewById<ImageView>(R.id.listGrade)
        val aboutUsBtn = findViewById<ImageView>(R.id.aboutUs)
        val downloadBtn = findViewById<ImageView>(R.id.downloadBtn)

        gradeBtn.setOnClickListener{
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }

        aboutUsBtn.setOnClickListener{
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }

        downloadBtn.setOnClickListener{
            val intent = Intent(this, DownloadLessons::class.java)
            startActivity(intent)
        }
    }
}