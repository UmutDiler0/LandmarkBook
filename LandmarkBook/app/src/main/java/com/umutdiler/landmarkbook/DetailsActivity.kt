package com.umutdiler.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.umutdiler.landmarkbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    lateinit var binding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selected = intent.getSerializableExtra("landmarkName") as LandmarkInfo

        binding.textView.text = selected.name
        binding.textView2.text = selected.country
        binding.imageView.setImageResource(selected.image)
    }
}