package com.example.trainingchallangech3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.trainingchallangech3.databinding.FragmentTigaBinding

class FragmentTiga : Fragment() {

    private var _binding: FragmentTigaBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       _binding = FragmentTigaBinding.inflate(inflater,container,false  )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sname = FragmentTigaArgs.fromBundle(arguments as Bundle).name
        binding.tvName.text ="Namanya: $sname"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}