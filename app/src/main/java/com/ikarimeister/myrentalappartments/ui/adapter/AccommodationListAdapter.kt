package com.ikarimeister.myrentalappartments.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikarimeister.myrentalappartments.R
import com.ikarimeister.myrentalappartments.ui.view.AccommodationViewHolder

class AccommodationListAdapter : RecyclerView.Adapter<AccommodationViewHolder>() {

    var accommodations: List<Any> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccommodationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.accommodation_vh, parent, false)
        return AccommodationViewHolder(view)
    }

    override fun getItemCount(): Int = accommodations.size

    override fun onBindViewHolder(holder: AccommodationViewHolder, position: Int) =
            holder.render(accommodations[position])
}