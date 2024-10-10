package com.example.laboratory34

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.laboratory34.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val predefinedColors = listOf(
        Color.RED,
        Color.GREEN,
        Color.BLUE
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: ConstraintLayout = binding.root
        setContentView(view)

        setupTextViewListeners()

        binding.buttonHide.setOnClickListener {
            binding.textViewName.visibility = View.INVISIBLE
        }

        binding.buttonShow.setOnClickListener {
            binding.textViewName.visibility = View.VISIBLE
        }
    }
    private fun setupTextViewListeners() {
        val textFields = listOf(binding.textViewName, binding.textViewGroup, binding.textViewCity)

        textFields.forEach { textView ->
            textView.setOnClickListener {
                changeTextColor(textView)
            }
        }
    }
    private fun changeTextColor(textView: TextView) {
        val colorIndex = (0..2).random()
        textView.setTextColor(predefinedColors[colorIndex])
    }
}

