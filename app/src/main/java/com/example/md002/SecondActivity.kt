package com.example.md002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageViewCover: ImageView = findViewById(R.id.imageViewCover)
        val textViewMovieTitle: TextView = findViewById(R.id.textViewMovieTitle)
        val textViewMovieDescription: TextView = findViewById(R.id.textViewMovieDescription)

        val bundle: Bundle? = intent.extras

        imageViewCover.setImageResource(bundle?.getInt("image_src")!!)
        textViewMovieTitle.text=bundle?.getString("movie_name")
        //bundle?.getInt("movie_name")?.let { textViewMovieTitle.setText(it) }
        //var description: String = getDescription(bundle?.getInt("desc")!!)
        var description = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. "
        textViewMovieDescription.text = description

    }

    private fun getDescription(int: Int): String {

        if (int==1){
            return "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa."
        }else if (int==2){
            return "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa."
        }else if (int==3){
            return "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa."
        }else if (int==4){
            return "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa."
        }else if (int==5){
            return "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa."
        }else if (int==6){
            return "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa."
        }else if (int==7){
            return "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa."
        }else{
            return "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa."
        }

    }
}