package com.example.a293_e37_cartelera

import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.res.ResourcesCompat
import com.example.a293_e37_cartelera.databinding.ActivityMovieBinding
import com.google.android.material.snackbar.Snackbar

class MovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_YES

        initContent()
        binding.buttonPlay.setOnClickListener {
            Snackbar.make(this, binding.constraintContainer, "Aguanta tantito, todavía no está tu peli", Snackbar.LENGTH_LONG).setAnchorView(binding.buttonPlay).show()
        }
        binding.buttonDownload.setOnClickListener {
            Snackbar.make(this, binding.constraintContainer, "Aguanta tantito, todavía no está tu peli", Snackbar.LENGTH_LONG).setAnchorView(binding.buttonPlay).show()
        }
    }

    fun initContent(){
        var movie = intent!!.getSerializableExtra("movie") as Movie
        binding.textMovie.text = movie.name
        binding.textDescription.text = movie.description
        binding.constraintContainer.background = ResourcesCompat.getDrawable(resources, movie.image, theme)
    }
}