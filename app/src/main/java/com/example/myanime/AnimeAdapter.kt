package com.example.myanime

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimeAdapter (private val context: Context, private val anime: List<Anime>, val listener: (Anime) -> Unit)
    : RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>(){

    class AnimeViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgAnime = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameAnime = view.findViewById<TextView>(R.id.tv_item_name)
        val descAnime = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(anime: Anime, listener: (Anime) -> Unit) {
            imgAnime.setImageResource(anime.imgAnime)
            nameAnime.text = anime.nameAnime
            descAnime.text = anime.descAnime
            itemView.setOnClickListener{
                listener(anime)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_anime, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.bindView(anime[position], listener)
    }

    override fun getItemCount(): Int = anime.size
    }
