package com.example.project_uts_android_ruangbm
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ChooseActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_semester)


        val grade1 = findViewById<Button>(R.id.grade1Button)
        val grade2 = findViewById<Button>(R.id.grade2Button)
        val grade3 = findViewById<Button>(R.id.grade3Button)
        val grade4 = findViewById<Button>(R.id.grade4Button)

        grade1.setOnClickListener{
            val intent = Intent(this, Home1::class.java)
            startActivity(intent)
        }
        grade2.setOnClickListener{
            val intent = Intent(this, Home2::class.java)
            startActivity(intent)
        }
        grade3.setOnClickListener{
            val intent = Intent(this, Home3::class.java)
            startActivity(intent)
        }
        grade4.setOnClickListener{
            val intent = Intent(this, Home4::class.java)
            startActivity(intent)
        }


    }

}