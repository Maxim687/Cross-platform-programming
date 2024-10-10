package com.example.laboratory32

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

data class City(
    val name: String,
    val country: String,
    val population: Int,
    val description: String
)

class MainActivity : AppCompatActivity() {

    val cities = mapOf(
        "Київ" to City("Київ", "Україна", 2963000, "Столиця України, розташована на річці Дніпро."),
        "Львів" to City("Львів", "Україна", 721301, "Культурний центр Західної України."),
        "Одеса" to City("Одеса", "Україна", 1015000, "Місто на узбережжі Чорного моря."),
        "Харків" to City("Харків", "Україна", 1443200, "Друге найбільше місто України."),
        "Дніпро" to City("Дніпро", "Україна", 968502, "Місто в центрі України на річці Дніпро."),
        "Запоріжжя" to City("Запоріжжя", "Україна", 738728, "Місто на південному сході України."),
        "Івано-Франківськ" to City("Івано-Франківськ", "Україна", 238196, "Місто в західній частині України."),
        "Чернівці" to City("Чернівці", "Україна", 265426, "Місто на південному заході України."),
        "Херсон" to City("Херсон", "Україна", 283649, "Місто на півдні України."),
        "Миколаїв" to City("Миколаїв", "Україна", 474024, "Місто на південному заході України.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchInput = findViewById<TextInputEditText>(R.id.TextInputCity)
        val searchButton = findViewById<Button>(R.id.button)
        val resultTextView = findViewById<TextView>(R.id.textView3)

        searchButton.setOnClickListener {
            val cityName = searchInput.text.toString().trim()

            val city = cities[cityName]

            if (city != null) {
                resultTextView.text = "Назва: ${city.name}\n" +
                        "Країна: ${city.country}\n" +
                        "Населення: ${city.population}\n" +
                        "Опис: ${city.description}"
            } else {
                resultTextView.text = "Місто не знайдено."
            }
        }
    }
}


