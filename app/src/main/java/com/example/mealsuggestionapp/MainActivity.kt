// Title: Meal Suggestion App
// Author: Kumran Maistry
// Date: 27 March 2025
// Version: 1,0
// Available: https://www.w3schools.com/kotlin/kotlin_conditions.php
// Additional Reference: https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.rawpixel.com%2Fsearch%2Fcroissant%2520wallpaper&psig=AOvVaw2EqlP8m942qlSfEvEM4Gjr&ust=1743193542087000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJCxy5CMq4wDFQAAAAAdAAAAABAE

package com.example.mealsuggestionapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
// declarations//
        val inputTimeOfDay = findViewById<EditText>(R.id.inputTimeOfDay)

        val inputButton = findViewById<Button>(R.id.inputButton)

        val resetButton = findViewById<Button>(R.id.resetButton)

        val displayView = findViewById<TextView>(R.id.DisplayView)
//input button//
        inputButton.setOnClickListener {
            val time = inputTimeOfDay.text.toString()
// error handling//
            if(time.isEmpty()) {
                displayView.text = "Please fill the field"
            } else if(time != "Morning" || time != "morning" || time != "Breakfast" || time != "breakfast"
                || time != "Mid Morning Snack" || time != "mid morning snack"
                || time != "Afternoon" || time != "afternoon" || time != "Lunch" || time != "lunch"
                || time != "Afternoon Snack" || time != "afternoon snack"
                || time != "Dinner" || time != "dinner" || time != "Supper" || time != "supper"
                || time != "After Dinner Snack" || time != "after dinner snack") {
                displayView.text = "Please fill the field correctly"
            }
// if else statements that determine food choices depending  on the time of day//
            if (time == "Morning" || time == "morning" || time == "Breakfast" || time == "breakfast") {
                displayView.text = "You should eat Jungle Oats and Berries"

            } else if(time == "Mid Morning Snack" || time == "mid morning snack") {
                displayView.text = "You should eat fruit like an Apple or some Nuts"

            } else if(time == "Afternoon" || time == "afternoon" || time == "Lunch" || time == "lunch") {
                displayView.text = "You should eat air-fried chicken and veg"

            } else if(time == "Afternoon Snack" || time == "afternoon snack") {
                displayView.text = "You should have Grapes or Nuts"

            } else if(time == "Dinner" || time == "dinner" || time == "Supper" || time == "supper") {
                displayView.text = "You should have home made Pasta"

            } else if(time == "After Dinner Snack" || time == "after dinner snack") {
                displayView.text = "Have Ice-Cream to cool down after a long day"

            }

            }

        // Title: Meal Suggestion App
        // Author: Kumran Maistry
        // Date: 27 March 2025
        // Version: 1,0
        // Available: https://www.w3schools.com/kotlin/kotlin_conditions.php
        // Additional Reference: https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.rawpixel.com%2Fsearch%2Fcroissant%2520wallpaper&psig=AOvVaw2EqlP8m942qlSfEvEM4Gjr&ust=1743193542087000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJCxy5CMq4wDFQAAAAAdAAAAABAE

// reset button
        resetButton.setOnClickListener {
            inputTimeOfDay.text.clear()
            displayView.text = "meal will be shown here"
        }

    }
}