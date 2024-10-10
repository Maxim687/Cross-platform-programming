package com.example.laboratory33

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val info = intent.getStringExtra("info")

        val textViewInfo = findViewById<TextView>(R.id.textViewInfo)

        when (info) {
            "author" -> textViewInfo.text = "Автор:Максим Тимощук"
            "faculty" -> textViewInfo.text = "Факультет: Факультет Інформаційних Технологій"
            "city" -> textViewInfo.text = "Місто: Київ"
        }

        val buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}

