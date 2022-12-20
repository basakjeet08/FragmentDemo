package com.basakjeet08.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.basakjeet08.fragmentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Initializing the Binding variable
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Creating a object of the NavHost View of the XML file to access its navigation graph/controller
        val navHostFragment =supportFragmentManager.findFragmentById(R.id.NavHostFragment) as NavHostFragment

        //Storing the Navigation Controller of the navController object
        val navController =navHostFragment.navController

        //Binding the navController with the BottomNavigationView object so it does the navigation in background
        binding.bottomNavigationView.setupWithNavController(navController)

    }
}