package com.example.trainingchallangech3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.trainingchallangech3.databinding.FragmentSatuBinding

class FragmentSatu : Fragment() {
    private var _binding: FragmentSatuBinding? = null
    private val binding get() = _binding!!

    companion object{
        val EXTRA_NAME = "EXTRA_NAME"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentSatuBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFragsatu.setOnClickListener {
            val nBundle = Bundle()
            nBundle.putString(EXTRA_NAME, "HOME PERTAMA")
            it.findNavController().navigate(R.id.action_fragmentSatu_to_fragmentDua, nBundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}