package com.example.project_uts_android_ruangbm

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class LessonDetailRL : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_detail_rl)

        val viewDownload = findViewById<ImageView>(R.id.viewDownload)
        viewDownload.setOnClickListener{
            val intent = Intent(this, DownloadLessons::class.java)
            startActivity(intent)
        }

        val downloadBtn = findViewById<Button>(R.id.downloadBtn)
        downloadBtn.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("downloadedlesson", "Rangkaian Listrik")
            setResult(Activity.RESULT_OK, resultIntent)
            Toast.makeText(this, "Downloaded", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}