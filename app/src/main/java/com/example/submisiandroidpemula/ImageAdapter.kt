package com.example.submisiandroidpemula

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (
    private val context: Context,
    private val images : List<Image>,
    private val listener: (Image) -> Unit
) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageSrc : ImageView = view.findViewById(R.id.img_an_image)
        private val title : TextView = view.findViewById(R.id.tv_an_name)
        private val genre : TextView = view.findViewById(R.id.tv_an_genre)
        private val rating : TextView = view.findViewById(R.id.tv_an_rating)

        @SuppressLint("SetTextI18n")
        fun bindView (image : Image, listener: (Image) -> Unit) {
            imageSrc.setImageResource(image.animeImage)
            title.text = image.animeTitle
            genre.text = "Genre : ${image.animeGenre}"
            rating.text = "Rating : ${image.animeRating}"
            itemView.setOnClickListener{listener(image)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder
    = ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view_anime,parent,false))

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position],listener)
    }
}
