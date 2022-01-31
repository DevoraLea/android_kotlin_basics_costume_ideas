package com.example.costumeideas.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.costumeideas.adapter.CustumeCardAdapter
import com.example.costumeideas.const.Layout
import com.example.costumeideas.databinding.ActivityHorizontalListBinding
import com.google.android.material.snackbar.Snackbar


class HorizontalListActivity: AppCompatActivity() {

    private lateinit var binding:ActivityHorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = CustumeCardAdapter(this,Layout.HORIZONTAL)
        binding.horizontalRecyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}