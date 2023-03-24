package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity_For_Fragments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_fragments)




        supportFragmentManager.beginTransaction().replace(R.id.FrameContainer, TheHomePageFragment.newInstance()).commit()

    }
}