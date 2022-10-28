package com.menaces.fate.unexpectedEncounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.menaces.fate.R

class ProposalActivity : AppCompatActivity() {
    private lateinit var proposalIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proposal)

        val leftButton : Button = findViewById(R.id.proposal_left_button)
        leftButton.setOnClickListener {
            launchCongratulate()
        }

        val rightButton : Button = findViewById(R.id.proposal_right_button)
        rightButton.setOnClickListener {
            launchBecomeNun()
        }
    }

    private fun launchCongratulate() {
        proposalIntent = Intent(this, CongratulateActivity::class.java)
        startActivity(proposalIntent)
    }

    private fun launchBecomeNun() {
        proposalIntent = Intent(this, NunActivity::class.java)
        startActivity(proposalIntent)
    }
}