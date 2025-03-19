package com.example.workoutapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import com.example.workoutapp.Activity_intro
import com.example.workoutapp.MainActivity
import com.example.workoutapp.R

class Activity_Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splashImage: ImageView = findViewById(R.id.splashImage)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Activity_intro::class.java)
            startActivity(intent)
            finish()
        }, 1000)
    }
}

