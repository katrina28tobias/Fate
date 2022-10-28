package com.menaces.fate.unexpectedEncounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.menaces.fate.R

class AskDateActivity : AppCompatActivity() {
    private lateinit var getReadyIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ask_date)

        val startButton : Button = findViewById(R.id.ask_date_continue_button)
        startButton.setOnClickListener {
            launchGetReadyScreen()
        }
    }

    private fun launchGetReadyScreen() {
        getReadyIntent = Intent(this, SlamPoetryActivity::class.java)
        startActivity(getReadyIntent)
    }
}