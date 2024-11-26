package com.sirketismi.kasimturkcellandroid2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sirketismi.kasimturkcellandroid2.databinding.FragmentCustomComponentBinding

class CustomComponentFragment : Fragment() {

    lateinit var binding : FragmentCustomComponentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentCustomComponentBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //activity?.supportFragmentManager

        val transaction = childFragmentManager.beginTransaction()
        transaction.replace(binding.layoutContainer.id, ContainerFragment())
        transaction.commit()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}