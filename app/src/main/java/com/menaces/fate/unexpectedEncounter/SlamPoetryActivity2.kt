package com.menaces.fate.unexpectedEncounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.menaces.fate.R

class SlamPoetryActivity2 : AppCompatActivity() {
    private lateinit var continueIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slam_poetry2)
        val continueButton : Button = findViewById(R.id.slam_poetry_2_continue_button)
        continueButton.setOnClickListener {
            launchNextScreen()
        }
    }

    private fun launchNextScreen() {
        continueIntent = Intent(this, SlamPoetryActivity3::class.java)
        startActivity(continueIntent)
    }

}