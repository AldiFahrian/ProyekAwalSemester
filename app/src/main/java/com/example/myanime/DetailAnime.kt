package com.example.myanime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailAnime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_anime)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val anime = intent.getParcelableExtra<Anime>(HalamanDepan.INTENT_PARCELABLE)

        val imgAnime = findViewById<ImageView>(R.id.img_item_photo)
        val nameAnime = findViewById<TextView>(R.id.tv_item_name)
        val descAnime = findViewById<TextView>(R.id.tv_item_description)

        imgAnime.setImageResource(anime?.imgAnime!!)
        nameAnime.text = anime.nameAnime
        descAnime.text=  anime.descAnime
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    // pada kotlin class disini, menerapkan materi navigasi untuk menampilkan halaman lebih detail dan juga navigasi untuk kembali ke halaman awal/home.
        //
    }
}