package com.menaces.fate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var storyIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton : Button = findViewById(R.id.start_button)
        startButton.setOnClickListener {
            launchStoryMenu()
        }
    }

    private fun launchStoryMenu() {
        storyIntent = Intent(this, StoryMenuActivity::class.java)
        startActivity(storyIntent)
    }


}