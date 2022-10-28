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

        val instructionsButton: Button = findViewById(R.id.instructions_button)
        instructionsButton.setOnClickListener{
            launchInstructions()
        }
    }

    private fun launchStoryMenu() {
        storyIntent = Intent(this, StoryTrialActivity::class.java)
        startActivity(storyIntent)
    }

    private fun launchInstructions() {
        storyIntent = Intent(this, InstructionsActivity::class.java)
        startActivity(storyIntent)
    }


}