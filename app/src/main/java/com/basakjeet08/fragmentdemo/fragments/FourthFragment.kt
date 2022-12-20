package com.basakjeet08.fragmentdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.basakjeet08.fragmentdemo.databinding.FragmentFourthBinding

class FourthFragment : Fragment() {

    //Initializing the Binding variable
    private lateinit var binding : FragmentFourthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFourthBinding.inflate(inflater , container , false)
        return binding.root
    }
}