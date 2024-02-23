package com.example.lesson_21

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lesson_21.databinding.RbSeasonsItemBinding

class SeasonsAdapter: RecyclerView.Adapter<SeasonsAdapter.NewViewHolder>() {

    var newList: List<Seasons>? = null
    inner class NewViewHolder(val bidding: RbSeasonsItemBinding ):  RecyclerView.ViewHolder(bidding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewViewHolder {
        return  NewViewHolder(
            RbSeasonsItemBinding.inflate(
                LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun getItemCount(): Int {
        return newList!!.size
    }

    override fun onBindViewHolder(holder: NewViewHolder, position: Int) {
        Glide.with(holder.itemView).load(newList?.get(position)!!.image).into(holder.bidding.ivSeasonPicture)
        holder.bidding.tvSeasonheader.text = newList!![position].header
    }
}