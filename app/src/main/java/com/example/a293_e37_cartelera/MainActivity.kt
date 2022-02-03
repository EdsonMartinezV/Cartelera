package com.example.a293_e37_cartelera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a293_e37_cartelera.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var movies: MutableList<Movie> = mutableListOf(
        Movie("Ant-Man", "Peyton Reed", 3.5f, "90 Minutes", R.drawable.ant_man, 2015, "Henry Phimm tiene que recuperar un super traje creado con su tecnología robada, será ayudado por un ex-convicto"),
        Movie("Black Panther", "Ryan Coogler", 4.2f, "115 Minutes", R.drawable.black_panther, 2018, "Wakanda no es lo que parece, su rey T-Chala protege a su pueblo bajo el manto de Pantera Negra"),
        Movie("Captain Marvel", "Anna Boden, Ryan Fleck", 3.1f, "105 Minutes", R.drawable.captain_marvel, 2019, "Una guerrera descendiente de los Kree defiende a la Tierra de peligros que no imaginamos que existen"),
        Movie("Captain America: Civil War", "Joe & Anthony Russo", 4.6f, "135 Minutes", R.drawable.civil_war, 2016, "Tras misiones en las que se habían tomado vidas inocentes, La ONU decide tomar el control de las operaciones de los vengadores"),
        Movie("Doctor Strange", "Scott Derrickson", 4.0f, "99 Minutes", R.drawable.dr_strange, 2016, "Stephen Strange, un afamado doctor busca ayuda tras perder el movimiento de sus manos, sin saber que se convertiría en el hechicero supremo"),
        Movie("Avengers: Endgame", "Joe & Anthony Russo", 4.8f, "240 Minutes", R.drawable.end_game, 2019, "Los vegadores buscan revertir el efecto del chasquido de Thanos viajando en el tiempo"),
        Movie("Guardians of the Galaxy", "James Gunn", 3.5f, "118 Minutes", R.drawable.guardians_of_the_galaxy, 2014, "Hay peligros más allá de nuestro cielo, de los que los Guardianes de la Galaxia se encargan sin que nosotros nos demos cuenta"),
        Movie("Spider-man: Homecoming", "Jon Watts", 4.5f, "110 Minutes", R.drawable.home_comming, 2017, "El héroe del vecindario tendrá su más emocionante misión hasta el momento, asistido por Iron Man"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_YES

        initRecycler()
    }

    fun initRecycler(){
        var adapter = MovieAdapter(movies)
        binding.recyclerMovies.layoutManager = LinearLayoutManager(this)
        binding.recyclerMovies.adapter = adapter
    }
}