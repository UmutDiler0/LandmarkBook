package com.umutdiler.landmarkbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.umutdiler.landmarkbook.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var landmarkList : ArrayList<LandmarkInfo>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var landmarkList = ArrayList<LandmarkInfo>()

        var pisa = LandmarkInfo("Pisa", "Italy", R.drawable.pisa,)
        var eiffel = LandmarkInfo("Eiffel", "France", R.drawable.eiffel,)
        var collesium = LandmarkInfo("Collesium", "Italy", R.drawable.collesium,)
        var bridge = LandmarkInfo("London Bridge", "United Kingdom", R.drawable.londonbridge,)

        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(collesium)
        landmarkList.add(bridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter
        /*
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map{ LandmarkInfo -> LandmarkInfo.name })
        
        binding.listView.adapter = adapter
        
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(this@MainActivity,DetailsActivity::class.java)
            intent.putExtra("landmarkName",landmarkList.get(position))
            startActivity(intent)
        }

         */

    }
}