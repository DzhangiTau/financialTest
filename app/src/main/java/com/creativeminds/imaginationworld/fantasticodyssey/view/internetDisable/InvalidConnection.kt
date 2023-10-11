package com.creativeminds.imaginationworld.fantasticodyssey.view.internetDisable

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.creativeminds.imaginationworld.fantasticodyssey.R
import com.creativeminds.imaginationworld.fantasticodyssey.databinding.FragmentInvalidConnectionBinding

class InvalidConnection : Fragment() {
    lateinit var binding: FragmentInvalidConnectionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInvalidConnectionBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_invalidConnection_to_splashFragment)
        }
    }
}