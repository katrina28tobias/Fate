package com.menaces.fate

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart
import com.menaces.fate.databinding.ActivityCoinFlipBinding

class CoinFlipActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCoinFlipBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinFlipBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.coinFlipCoin.setOnClickListener{
            onCoinTap()
        }

    }

    private fun onCoinTap(){
        val randomNumber = (1..50).random()
        if(randomNumber%2 == 1){
            flipTheCoin(R.drawable.ic_left, "Left")
        }else{
            flipTheCoin(R.drawable.ic_right, "Right")
        }

    }
    private fun flipTheCoin(imageId: Int, coinSide:String){
        val animator = ObjectAnimator.ofFloat(binding.coinFlipCoin, View.ROTATION_Y, 1800f, 0f)
        animator.duration = 2000
        animator.doOnStart {
            binding.coinFlipCoin.isClickable = false
        }
        animator.start()
        animator.doOnEnd {
            binding.coinFlipCoin.setImageResource(imageId)
            binding.coinFlipCoin.isClickable = true
            Toast.makeText(this, coinSide, Toast.LENGTH_SHORT).show()

        }
    }
}