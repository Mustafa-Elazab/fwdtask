package com.example.fwdtask.ui.welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.fwdtask.R
import com.example.fwdtask.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    private lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWelcomeBinding.inflate(layoutInflater , container , false)

        binding.welcomeNextButton.setOnClickListener{
            it.findNavController().navigate(R.id.action_welcomeFragment_to_instructionsFragment)
        }


        return binding.root
    }
}