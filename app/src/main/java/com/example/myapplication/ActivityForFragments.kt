package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityForFragmentsBinding
import com.google.android.material.bottomnavigation.BottomNavigationView



class ActivityForFragments : AppCompatActivity() {


    private lateinit var blinding: ActivityForFragmentsBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        blinding = ActivityForFragmentsBinding.inflate(layoutInflater)
        setContentView(blinding.root)

        replaceFrag(TheHomePageFragment())

        blinding.NavigationBar.setOnItemReselectedListener{

            when(it.itemId){

                R.id.homeBtn ->{ replaceFrag(TheHomePageFragment())}
                R.id.ShopCurtBtn -> {replaceFrag(Cart())}
                R.id.ProfileBtn -> {replaceFrag(ProfileFragment())}


                else -> {  }

            }
            true
        }






    }


    private fun replaceFrag(fragment: Fragment)
    {
        val fragmentManager = supportFragmentManager
        var fragmenTransaction = fragmentManager.beginTransaction()
        fragmenTransaction.replace(R.id.FrameContainer, fragment)
        fragmenTransaction.commit()

    }





}