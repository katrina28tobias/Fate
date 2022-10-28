package com.menaces.fate.unexpectedEncounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.menaces.fate.R

class ThrowCoffeeActivity : AppCompatActivity() {
    private lateinit var chooseDateIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_throw_coffee)

        val continueButton: Button = findViewById(R.id.throw_coffee_continue_button)
        continueButton.setOnClickListener {
            launchChooseDate()
        }
    }

    private fun launchChooseDate() {
        chooseDateIntent = Intent(this, ChooseDateActivity::class.java)
        startActivity(chooseDateIntent)
    }

}