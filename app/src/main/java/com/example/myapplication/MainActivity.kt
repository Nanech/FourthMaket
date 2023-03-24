package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hmpg = findViewById<Button>(R.id.Acess)


        hmpg.setOnClickListener()
        {
            val intent = Intent(this, Activity_For_Fragments::class.java )
            startActivity(intent)
        }



    }
}