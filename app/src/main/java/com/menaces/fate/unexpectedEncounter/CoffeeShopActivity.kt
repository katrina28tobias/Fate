package com.menaces.fate.unexpectedEncounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.menaces.fate.R

class CoffeeShopActivity : AppCompatActivity() {

    private lateinit var nameErrorIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_shop)

        val startButton : Button = findViewById(R.id.coffee_shop_continue_button)
        startButton.setOnClickListener {
            launchNameError()
        }
    }

    private fun launchNameError() {
        nameErrorIntent = Intent(this, NameErrorActivity::class.java)
        startActivity(nameErrorIntent)
    }
}

