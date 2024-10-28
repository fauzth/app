package com.example.project_uts_android_ruangbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home1)

        val gradeBtn = findViewById<ImageView>(R.id.listGrade)
        val aboutUsBtn = findViewById<ImageView>(R.id.aboutUs)
        val downloadBtn = findViewById<ImageView>(R.id.downloadBtn)
        val rlBtn = findViewById<ImageView>(R.id.rlBtn)

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

        rlBtn.setOnClickListener{
            val intent = Intent(this, ClassDashboardRL::class.java)
            startActivity(intent)
        }
    }
}