package com.murallaromana.dam.segundo.factsapp.adapters

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.murallaromana.dam.segundo.factsapp.databinding.ItemFactBinding
import com.murallaromana.dam.segundo.factsapp.model.entities.Fact

class FactsListAdapter(private val facts: ArrayList<Fact>, val context: Context): Adapter<FactsListAdapter.FactsViewHolder>() {

    class FactsViewHolder(private val itemBinding: ItemFactBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(fact: Fact) {
            itemBinding.tvYear.text = fact.year
            itemBinding.tvDescription.text = fact.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FactsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FactsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}