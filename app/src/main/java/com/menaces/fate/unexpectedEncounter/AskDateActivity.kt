package com.menaces.fate.unexpectedEncounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.menaces.fate.R

class AskDateActivity : AppCompatActivity() {
    private lateinit var throwCoffeeIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_throw_coffee)

        val startButton : Button = findViewById(R.id.throw_coffee_continue_button)
        startButton.setOnClickListener {
//            launchThrowCoffee() // wrong one
        }
    }

//    private fun launchThrowCoffee() {
//        throwCoffeeIntent = Intent(this, ThrowCoffeeActivity::class.java)
//        startActivity(throwCoffeeIntent)
//    }
}