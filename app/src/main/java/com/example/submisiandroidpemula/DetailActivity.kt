package com.example.submisiandroidpemula

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class DetailActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val image = intent.getParcelableExtra<Image>(MainActivity.INTENT_PARCELABLLE)

        val imgDetail = findViewById<ImageView>(R.id.img_detail)

        val detailTitle = findViewById<TextView>(R.id.tv_title_detail)
        val detailGenre = findViewById<TextView>(R.id.tv_genre_detail)
        val detailRating = findViewById<TextView>(R.id.tv_rating_detail)
        val desc = findViewById<TextView>(R.id.tv_desc)

        imgDetail.setImageResource(image!!.animeImage)
        detailTitle.text = image.animeTitle
        detailGenre.text = "Genre  : ${image.animeGenre}"
        detailRating.text ="Rating : ${image.animeRating}"
        desc.text = "Sinopsis : ${image.animeDesc}"

    }
}