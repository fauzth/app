package com.example.project_uts_android_ruangbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Toast

class ClassDashboardRL : AppCompatActivity() {

    private val downloadedlessons = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_dashboard_rl)

        val subLesson1 = findViewById<RelativeLayout>(R.id.container1)
        subLesson1.setOnClickListener{
            val intent = Intent(this, LessonDetailRL::class.java)
            startActivityForResult(intent,1)
        }

        val viewDownload = findViewById<ImageView>(R.id.viewDownload)
        viewDownload.setOnClickListener{
            val intent = Intent(this, DownloadLessons::class.java)
            intent.putStringArrayListExtra("downloadedLessons", ArrayList(downloadedlessons))
            startActivity(intent)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && data != null) {
            val downloadedLesson = data.getStringExtra("downloadedLesson")
            downloadedLesson?.let {
                downloadedlessons.add(it)
            }
        }
    }



}