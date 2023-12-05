package com.aditya.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Main_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomBar : BottomNavigationView = findViewById(R.id.bottomBar)
        bottomBar.setOnItemSelectedListener {
           if (it.itemId==R.id.gaurdButton){
               inflateFragment(GaurdFragment.newInstance())
           }
            else if(it.itemId==R.id.homeItem){
                inflateFragment(HomeFragment.newInstance())
           }
            else if(it.itemId==R.id.dashboardItem){
                inflateFragment(DashboardFragment.newInstance())
           }
           else if(it.itemId==R.id.userItem){
               inflateFragment(UserFragment.newInstance())
           }
            else{
                inflateFragment(HomeFragment.newInstance())
           }


            true
        }


    }

    private fun inflateFragment(newInstance : Fragment) {
        val a = supportFragmentManager.beginTransaction()
        a.replace(R.id.container,newInstance)
        a.commit()
    }

    }