package com.peacecodes.recyclerviewkodecamp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.peacecodes.recyclerviewkodecamp.R
import com.peacecodes.recyclerviewkodecamp.model.Motivation

class MotivationAdapter(private val context: Context, private val dataSet: List<Motivation>) :
    RecyclerView.Adapter<MotivationAdapter.MotivationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotivationViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false )
        return MotivationViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: MotivationViewHolder, position: Int) {
        val item = dataSet[position]
        holder.motivationText.text = context.resources.getString(item.stringResourceId)
        holder.motivationImage.setImageResource(item.imageResouceId)
    }

    override fun getItemCount() = dataSet.size

class MotivationViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val motivationText = view.findViewById<TextView>(R.id.item_title)
    val motivationImage = view.findViewById<ImageView>(R.id.item_image)
}

}