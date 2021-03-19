package com.example.submisiandroidpemula

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image (
    val animeImage : Int,
    val animeTitle : String,
    val animeGenre : String,
    val animeRating : String,
    val animeDesc : String
):Parcelable

