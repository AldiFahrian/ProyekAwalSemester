package com.example.myanime

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Anime(
    val imgAnime: Int,
    val nameAnime: String,
    val descAnime: String,
// data class ini adalah variable untuk program penampil film, disini saya menggunakan Int untuk image,string untuk nama dan deskripsi anime
) : Parcelable

