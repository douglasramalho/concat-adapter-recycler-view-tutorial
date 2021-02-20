package com.example.mergeadapterrecyclerviewtutorial

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mergeadapterrecyclerviewtutorial.databinding.ItemTipBinding

class TipsAdapter : ListAdapter<Tip, TipsAdapter.TipViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        return TipViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Tip>() {
            override fun areItemsTheSame(oldItem: Tip, newItem: Tip): Boolean {
                return oldItem.description == newItem.description
            }

            override fun areContentsTheSame(oldItem: Tip, newItem: Tip): Boolean {
                return oldItem == newItem
            }

        }
    }

    class TipViewHolder(
        private val itemBinding: ItemTipBinding
    ) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(tip: Tip) {
            itemBinding.textTip.text = tip.description
        }

        companion object {
            fun create(parent: ViewGroup): TipViewHolder {
                val itemBinding = ItemTipBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )

                return TipViewHolder(itemBinding)
            }
        }
    }
}