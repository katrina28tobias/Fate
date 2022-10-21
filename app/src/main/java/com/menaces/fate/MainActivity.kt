package com.menaces.fate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var genreIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton : Button = findViewById(R.id.start_button)
        startButton.setOnClickListener {
            launchGenreMenu()
        }
    }

    private fun launchGenreMenu() {
        genreIntent = Intent(this, GenreMenuActivity::class.java)
        startActivity(genreIntent)
    }


}