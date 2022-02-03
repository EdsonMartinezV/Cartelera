package com.example.a293_e37_cartelera

import android.content.Intent
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.a293_e37_cartelera.databinding.ItemMovieBinding

class MovieAdapter(var movies:MutableList<Movie>) : RecyclerView.Adapter<MovieAdapter.MovieHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieHolder, position: Int) {
        holder.init(movies[position])
    }

    override fun getItemCount(): Int = movies.size

    class MovieHolder(val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun init(movie: Movie){
            binding.textName.text = movie.name
            binding.textDirector.text = movie.director
            binding.textYear.text = movie.releaseYear.toString()
            binding.ratingMovie.rating = movie.rating
            binding.textDuration.text = movie.duration
            binding.imageMovie.setImageResource(movie.image)

            binding.root.setOnClickListener {
                val intent = Intent(binding.root.context, MovieActivity::class.java)
                intent.putExtra("movie", movie)
                startActivity(binding.root.context, intent, null)
            }
        }
    }
}