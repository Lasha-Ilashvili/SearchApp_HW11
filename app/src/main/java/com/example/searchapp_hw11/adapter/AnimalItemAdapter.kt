package com.example.searchapp_hw11.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.searchapp_hw11.databinding.AnimalItemBinding
import com.example.searchapp_hw11.model.Animal

class AnimalItemAdapter : ListAdapter<Animal, AnimalItemAdapter.AnimalItemViewHolder>(
    object : DiffUtil.ItemCallback<Animal>() {

        override fun areItemsTheSame(oldItem: Animal, newItem: Animal): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: Animal, newItem: Animal): Boolean {
            return oldItem == newItem
        }

    }
) {

    var callBack: ((String) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalItemViewHolder {
        return AnimalItemViewHolder(
            AnimalItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimalItemViewHolder, position: Int) {
        holder.bind()
    }

    inner class AnimalItemViewHolder(private val binding: AnimalItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
            val animal = currentList[adapterPosition]

            with(binding) {
                imageItem.setImageResource(animal.image)
                imageItem.setOnClickListener {
                    callBack?.invoke(animal.title)
                }
            }
        }
    }
}