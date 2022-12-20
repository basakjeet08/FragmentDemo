package com.basakjeet08.fragmentdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.basakjeet08.fragmentdemo.R
import com.basakjeet08.fragmentdemo.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    //Initializing the Binding variable
    private lateinit var binding: FragmentSecondBinding

    //Initializing the navController object of this Fragment
    private val navController = findNavController()

   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater , container , false)

       //Setting the OnClickListener to navigate to the Next Fragment
       binding.btn4thFragment.setOnClickListener{

           //Calling the Nav Controller and then asking it to navigate to the given action
           navController.navigate(R.id.action_secondFragment_to_fourthFragment)
       }
       return binding.root
    }
}