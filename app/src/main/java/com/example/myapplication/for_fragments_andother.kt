package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class for_fragments_andother : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_fragments_andother)




        supportFragmentManager.beginTransaction().replace(R.id.ForOurFragment, TheHomePageFragment.newInstance()).commit()

    }
}