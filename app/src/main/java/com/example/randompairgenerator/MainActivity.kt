package com.example.randompairgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var image_1: ImageView
    lateinit var image_2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findMatch: Button = findViewById(R.id.find_match)
        val clearMe: Button = findViewById(R.id.clear_me)

        findMatch.setOnClickListener { find_Match() }
        clearMe.setOnClickListener { clear_Me() }

        image_1 = findViewById(R.id.image_1)
        image_2 = findViewById(R.id.image_2)

    }

    private fun find_Match() {
        image_1.setImageResource(randomMatchGenerator_1())
        image_2.setImageResource(randomMatchGenerator_2())

        Toast.makeText(this, "Match Found!", Toast.LENGTH_SHORT).show()

    }

    private fun clear_Me() {
        image_1.setImageResource(R.drawable.empty_image)
        image_2.setImageResource(R.drawable.empty_image)
    }

    private fun randomMatchGenerator_1(): Int {
        val randomInt = (1..10).random()

        return when (randomInt) {
            1 -> R.drawable.dog1
            2 -> R.drawable.dog2
            3 -> R.drawable.dog3
            4 -> R.drawable.dog4
            5 -> R.drawable.dog5
            6 -> R.drawable.dog6
            7 -> R.drawable.dog7
            8 -> R.drawable.dog8
            9 -> R.drawable.dog9
            else -> R.drawable.dog10
        }
    }

    private fun randomMatchGenerator_2(): Int {
        val randomInt = (1..10).random()

        return when (randomInt) {
            1 -> R.drawable.cat1
            2 -> R.drawable.cat2
            3 -> R.drawable.cat3
            4 -> R.drawable.cat4
            5 -> R.drawable.cat5
            6 -> R.drawable.cat6
            7 -> R.drawable.cat7
            8 -> R.drawable.cat8
            9 -> R.drawable.cat9
            else -> R.drawable.cat10
        }
    }
}