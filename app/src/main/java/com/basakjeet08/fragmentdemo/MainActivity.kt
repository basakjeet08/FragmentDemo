package com.basakjeet08.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.basakjeet08.fragmentdemo.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bottomNavigationView = binding.bottomNavigationView
        val navHostFragment =supportFragmentManager.findFragmentById(R.id.NavHostFragment) as NavHostFragment
        val navController =navHostFragment.navController
        bottomNavigationView.setupWithNavController(navController)

    }
}