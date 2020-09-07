package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.inflate
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val answers = arrayOf("T", "F", "F", "F")
    private var numOfCorrectAnswers = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener{
            onClick()
        }
    }

    private fun onClick() {
        var givenAnswers = arrayOf(binding.r1c3.text.toString(), binding.r2c3.text.toString(), binding.r3c3.text.toString(), binding.r4c3.text.toString())

        for (i in 0 until givenAnswers.size) {
            if (givenAnswers[i] == (answers[i])){
                numOfCorrectAnswers++
            }
        }

        Toast.makeText(this, getString(R.string.correct_text, numOfCorrectAnswers), Toast.LENGTH_SHORT).show()
        numOfCorrectAnswers = 0
    }


}