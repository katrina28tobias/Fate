package com.menaces.fate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class InstructionsActivity : AppCompatActivity() {
    private lateinit var sIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructions)

        val coinButton : Button = findViewById(R.id.instructions_coin)
        coinButton.setOnClickListener {
            launchCoinFlipActivity()
        }

    }

    private fun launchCoinFlipActivity() {
        sIntent = Intent(this, CoinFlipActivity::class.java)
        startActivity(sIntent)
    }
}