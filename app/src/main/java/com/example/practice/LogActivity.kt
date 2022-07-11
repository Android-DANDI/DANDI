package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice.databinding.ActivityLogBinding
import android.content.Intent
import android.view.View
import android.widget.Button

class LogActivity : AppCompatActivity() {
    lateinit var binding:ActivityLogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_log)

        binding.textView3.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            var nextintent = Intent(this, tutorialActivity::class.java)
            startActivity(nextintent)
        }
    }

}