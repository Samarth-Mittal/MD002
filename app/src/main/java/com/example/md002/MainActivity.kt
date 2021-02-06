package com.example.md002

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LL1.setOnClickListener(){
            val intent=Intent(this, SecondActivity::class.java)
            val bundle=Bundle()
            bundle.putSerializable("image_src", R.drawable.image1)
            bundle.putString("movie_name", "The Family Man")
            bundle.putInt("desc", 1)
            intent.putExtras(bundle)
            runSecondActivity(intent)
        }
        LL2.setOnClickListener(){
            val intent=Intent(this, SecondActivity::class.java)
            val bundle=Bundle()
            bundle.putSerializable("image_src", R.drawable.image2)
            bundle.putString("movie_name", "Scary Movie")
            bundle.putInt("desc", 2)
            intent.putExtras(bundle)
            runSecondActivity(intent)
        }
        LL3.setOnClickListener(){
            val intent=Intent(this, SecondActivity::class.java)
            val bundle=Bundle()
            bundle.putSerializable("image_src", R.drawable.image3)
            bundle.putString("movie_name", "Maleficent")
            bundle.putInt("desc", 3)
            intent.putExtras(bundle)
            runSecondActivity(intent)
        }
        LL4.setOnClickListener(){
            val intent=Intent(this, SecondActivity::class.java)
            val bundle=Bundle()
            bundle.putSerializable("image_src", R.drawable.image4)
            bundle.putString("movie_name", "Onward")
            bundle.putInt("desc", 4)
            intent.putExtras(bundle)
            runSecondActivity(intent)
        }
        LL5.setOnClickListener(){
            val intent=Intent(this, SecondActivity::class.java)
            val bundle=Bundle()
            bundle.putSerializable("image_src", R.drawable.image5)
            bundle.putString("movie_name", "1917")
            bundle.putInt("desc", 5)
            intent.putExtras(bundle)
            runSecondActivity(intent)
        }
        LL6.setOnClickListener(){
            val intent=Intent(this, SecondActivity::class.java)
            val bundle=Bundle()
            bundle.putSerializable("image_src", R.drawable.image6)
            bundle.putString("movie_name", "Tenet")
            bundle.putInt("desc", 6)
            intent.putExtras(bundle)
            runSecondActivity(intent)
        }
        LL7.setOnClickListener(){
            val intent=Intent(this, SecondActivity::class.java)
            val bundle=Bundle()
            bundle.putSerializable("image_src", R.drawable.image7)
            bundle.putString("movie_name", "How to Train Your Dragon 3")
            bundle.putInt("desc", 7)
            intent.putExtras(bundle)
            runSecondActivity(intent)
        }
        LL8.setOnClickListener(){
            val intent=Intent(this, SecondActivity::class.java)
            val bundle=Bundle()
            bundle.putSerializable("image_src", R.drawable.image8)
            bundle.putString("movie_name", "Deadpool 2")
            bundle.putInt("desc", 8)
            intent.putExtras(bundle)
            runSecondActivity(intent)
        }

    }

    private fun runSecondActivity(intent: Intent){
        startActivity(intent)
    }

}