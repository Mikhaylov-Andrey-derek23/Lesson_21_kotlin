package com.example.lesson_21

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lesson_21.databinding.RbNewsItemBinding

class NewsAddapter : RecyclerView.Adapter<NewsAddapter.NewViewHolder>() {

    var newList: List<News>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewViewHolder {

        return  NewViewHolder(RbNewsItemBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun getItemCount(): Int {
        return newList!!.size
    }

    override fun onBindViewHolder(holder: NewViewHolder, position: Int) {

        Glide.with(holder.itemView).load(newList?.get(position)!!.Image).into(holder.bidding.ivNewsPicture)
        holder.bidding.tvNewsHeader.text = newList!![position].header
        holder.bidding.tvText.text = newList!![position].text

    }

    inner class NewViewHolder(val bidding: RbNewsItemBinding) : RecyclerView.ViewHolder(bidding.root)

}