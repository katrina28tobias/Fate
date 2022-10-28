package com.menaces.fate.unexpectedEncounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.menaces.fate.CoinFlipActivity
import com.menaces.fate.R

class NameErrorActivity : AppCompatActivity() {
    private lateinit var sIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_error)

        val leftButton : Button = findViewById(R.id.name_error_left_button)
        leftButton.setOnClickListener {
            launchAskDate()
        }

        val rightButton : Button = findViewById(R.id.name_error_right_button)
        rightButton.setOnClickListener {
            launchThrowCoffee()
        }


    }

    private fun launchAskDate() {
        sIntent = Intent(this, AskDateActivity::class.java)
        startActivity(sIntent)
        overridePendingTransition(R.anim.slide_in_left,
            R.anim.slide_out_right);
    }

    private fun launchThrowCoffee() {
        sIntent = Intent(this, ThrowCoffeeActivity::class.java)
        startActivity(sIntent)
        overridePendingTransition(R.anim.slide_in_right,
            R.anim.slide_out_left);
    }


}