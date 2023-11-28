package com.example.searchapp_hw11.fragment

import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.example.searchapp_hw11.R
import com.example.searchapp_hw11.adapter.AnimalItemAdapter
import com.example.searchapp_hw11.data.Datasource
import com.example.searchapp_hw11.databinding.FragmentAnimalBinding

class AnimalFragment : Fragment() {

    private var _binding: FragmentAnimalBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: AnimalItemAdapter

    private val animalList = Datasource.animals.values.toList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnimalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpRecyclerView()
        setUpSearch()
    }

    private fun setUpRecyclerView() {
        adapter = AnimalItemAdapter().apply {
            itemOnClick = ::startNewFragment
            submitList(animalList)
        }
        binding.animalRecyclerView.adapter = adapter
    }

    private fun setUpSearch() {
        binding.etSearch.addTextChangedListener { title: Editable? ->
            adapter.submitList(
                title?.let { searchedText: Editable ->
                    animalList.filter { it.title.contains(searchedText, ignoreCase = true) }
                } ?: animalList
            )
        }
    }

    private fun startNewFragment(title: String) {
        val animalPageFragment = AnimalPageFragment()
        animalPageFragment.arguments = Bundle().apply { putString("title", title) }

        requireActivity().supportFragmentManager.beginTransaction().apply {
            replace(R.id.animalFragmentContainer, animalPageFragment)
            addToBackStack(null)
            commit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}