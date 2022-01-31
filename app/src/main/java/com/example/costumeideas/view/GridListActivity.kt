package com.example.costumeideas.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.costumeideas.adapter.CustumeCardAdapter
import com.example.costumeideas.const.Layout
import com.example.costumeideas.databinding.ActiviytGridListBinding

class GridListActivity: AppCompatActivity() {
    private lateinit var binding: ActiviytGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActiviytGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = CustumeCardAdapter(this, Layout.GRID)
        binding.gridRecyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}