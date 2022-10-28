package com.menaces.fate.unexpectedEncounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.menaces.fate.R

class ChooseDateActivity : AppCompatActivity() {
    private lateinit var chooseDateIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_date)

        val leftButton: Button = findViewById(R.id.choose_date_left_button)
        leftButton.setOnClickListener {
            launchRollerBlading()
        }

        val rightButton: Button = findViewById(R.id.choose_date_right_button)
        rightButton.setOnClickListener {
            launchSlamPoetry()
        }
    }

    private fun launchRollerBlading() {
        chooseDateIntent = Intent(this, RollerbladingActivity::class.java)
        startActivity(chooseDateIntent)
    }

    private fun launchSlamPoetry() {
        chooseDateIntent = Intent(this, SlamPoetryActivity::class.java)
        startActivity(chooseDateIntent)
    }
}