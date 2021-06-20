package com.nouser666.superdemo.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.nouser666.superdemo.R
import com.nouser666.superdemo.base.BaseActivity
import com.nouser666.superdemo.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //应用底部栏
        val navController = Navigation.findNavController(this, R.id.main_nav_fragment)
        NavigationUI.setupWithNavController(binding.mainNavView, navController)
    }
}