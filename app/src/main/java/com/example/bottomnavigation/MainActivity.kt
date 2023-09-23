package com.example.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binder: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)
        bottomNavigation()

    }
    private fun bottomNavigation(){
        val navController = findNavController(R.id.nav_host_fragment)
        val navView: BottomNavigationView = binder.bottomNavView
        navView.setupWithNavController(navController)
    }
    private fun clickEvent(){


    }
}
