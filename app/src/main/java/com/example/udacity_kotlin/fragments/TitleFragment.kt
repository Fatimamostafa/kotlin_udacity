package com.example.udacity_kotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.udacity_kotlin.R
import com.example.udacity_kotlin.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_title, container, false)

        binding.playButton.setOnClickListener { view: View ->
          view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }

        return binding.root
    }
}
