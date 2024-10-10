package com.example.laboratory33

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAuthor = findViewById<Button>(R.id.buttonAuthor)
        val buttonFaculty = findViewById<Button>(R.id.buttonFaculty)
        val buttonCity = findViewById<Button>(R.id.buttonCity)

        buttonAuthor.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("info", "author")
            startActivity(intent)
        }

        buttonFaculty.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("info", "faculty")
            startActivity(intent)
        }

        buttonCity.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("info", "city")
            startActivity(intent)
        }
    }
}

