package com.menaces.fate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.card.MaterialCardView
import com.menaces.fate.unexpectedEncounter.CoffeeShopActivity

class StoryTrialActivity : AppCompatActivity() {

    private lateinit var storyIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_trial)

        val storyCard = findViewById<MaterialCardView>(R.id.story_card)
        storyCard.setOnClickListener {
            launchCoffeeShop()
        }
    }

    private fun launchCoffeeShop() {
        storyIntent = Intent(this, CoffeeShopActivity::class.java)
        startActivity(storyIntent)
    }
}