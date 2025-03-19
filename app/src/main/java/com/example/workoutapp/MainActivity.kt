package com.example.workoutapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val horizontalScrollView = findViewById<HorizontalScrollView>(R.id.horizontalScrollView)
        horizontalScrollView.smoothScrollTo(0, 0)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            return@setOnApplyWindowInsetsListener insets
        }

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, Activity_Fourth::class.java)
            startActivity(intent)
        }

        val imageView5: ImageView = findViewById(R.id.imageView5)
        imageView5.setOnClickListener {
            val intent = Intent(this, Activity_First::class.java)
            startActivity(intent)
        }

        val imageView6: ImageView = findViewById(R.id.imageView6)
        imageView6.setOnClickListener {
            val intent = Intent(this, Activity_Second::class.java)
            startActivity(intent)
        }

        val imageView7: ImageView = findViewById(R.id.imageView7)
        imageView7.setOnClickListener {
            val intent = Intent(this, Activity_Third::class.java)
            startActivity(intent)
        }

        val textView6: TextView = findViewById(R.id.textView6)
        textView6.setOnClickListener {
            val intent = Intent(this, Activity_Library::class.java)
            startActivity(intent)
        }

        val menuicon: ImageView = findViewById(R.id.menuicon)
        menuicon.setOnClickListener {
            val intent = Intent(this, Activity_Library::class.java)
            startActivity(intent)
        }

        val searchicon: ImageView = findViewById(R.id.searchicon)
        searchicon.setOnClickListener {
            val intent = Intent(this, Activity_Search::class.java)
            startActivity(intent)
        }
    }
}