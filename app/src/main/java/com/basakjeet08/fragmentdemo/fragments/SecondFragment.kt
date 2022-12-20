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
    private lateinit var binding: FragmentSecondBinding
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater , container , false)

       binding.btn4thFragment.setOnClickListener{
           findNavController().navigate(R.id.action_secondFragment_to_fourthFragment)
       }
       return binding.root
    }
}