package com.sirketismi.kasimturkcellandroid2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sirketismi.kasimturkcellandroid2.databinding.FragmentContainerBinding
import com.sirketismi.kasimturkcellandroid2.databinding.FragmentCustomComponentBinding

class ContainerFragment : Fragment() {

    lateinit var binding: FragmentContainerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentContainerBinding.inflate(inflater)

        return binding.root
    }
}