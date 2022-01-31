package com.example.costumeideas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.costumeideas.databinding.ActivityMainBinding
import com.example.costumeideas.view.GridListActivity
import com.example.costumeideas.view.HorizontalListActivity
import com.example.costumeideas.view.VerticalListActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var intentList: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHorizontal.setOnClickListener{ launchHorizonal() }
        binding.btnGrid.setOnClickListener { launchGrid() }
        binding.btnVeritcal.setOnClickListener{ launchVerical() }

    }
    fun message()
    {
        Snackbar.make(binding.layoutMain,"heree",Snackbar.LENGTH_SHORT).show()
    }
    fun launchHorizonal(){
        intentList = Intent(this, HorizontalListActivity::class.java)
        startActivity(intentList)
    }
    fun launchVerical(){
        intentList = Intent(this, VerticalListActivity::class.java)
        startActivity(intentList)
    }
    fun launchGrid(){
        intentList = Intent(this, GridListActivity::class.java)
        startActivity(intentList)
    }
}