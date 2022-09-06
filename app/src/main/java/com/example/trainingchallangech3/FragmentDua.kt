package com.example.trainingchallangech3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.trainingchallangech3.databinding.FragmentDuaBinding

class FragmentDua : Fragment() {

    private var _binding: FragmentDuaBinding? = null
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentDuaBinding.inflate(inflater, container , false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Menangkap data argumen sesuai yang dimasukkan
        val sName = arguments?.getString(FragmentSatu.EXTRA_NAME)
        binding!!.nameone.text = "Nama Kamu: $sName"

        binding!!.btnFragmentKetiga.setOnClickListener { view ->
            if (binding!!.edname.text.isNullOrEmpty()) {
                Toast.makeText(requireContext(),"Nama Anda Belum Disi",Toast.LENGTH_SHORT).show()
            } else {


                val actionToFragmentTiga = FragmentDuaDirections.actionFragmentDuaToFragmentTiga()
                actionToFragmentTiga.name = binding!!.edname.text.toString()
                view.findNavController().navigate(actionToFragmentTiga)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}