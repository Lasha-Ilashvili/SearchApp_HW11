package com.example.searchapp_hw11.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.searchapp_hw11.data.Datasource
import com.example.searchapp_hw11.databinding.FragmentAnimalPageBinding

class AnimalPageFragment : Fragment() {

    private var _binding: FragmentAnimalPageBinding? = null
    private val binding get() = _binding!!

    private var title: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        title = requireArguments().getString("title")
        _binding = FragmentAnimalPageBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpPage()
        setUpListener()
    }

    private fun setUpPage() {
        val animal = Datasource.animals[title]!!

        with(binding) {
            ivAnimalImage.setImageResource(animal.image)
            tvAnimalTitle.text = animal.title
            tvAnimalDescription.text = animal.description
        }
    }

    private fun setUpListener() {
        binding.btnBack.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
    }
}
