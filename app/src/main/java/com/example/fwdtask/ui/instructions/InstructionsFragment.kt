package com.example.fwdtask.ui.instructions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.fwdtask.R
import com.example.fwdtask.databinding.FragmentInstructionsBinding


class InstructionsFragment : Fragment(R.layout.fragment_instructions) {

    private lateinit var binding: FragmentInstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInstructionsBinding.inflate(layoutInflater , container , false)

        binding.instructionsNextButton.setOnClickListener{
            it.findNavController().navigate(R.id.action_instructionsFragment_to_homeFragment)
        }


        return binding.root
    }
}