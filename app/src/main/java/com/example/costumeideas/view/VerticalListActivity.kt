package com.example.costumeideas.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.costumeideas.adapter.CustumeCardAdapter
import com.example.costumeideas.const.Layout
import com.example.costumeideas.databinding.ActivityVerticalListBinding
import com.google.android.material.snackbar.Snackbar

class VerticalListActivity:AppCompatActivity() {
    private lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.verticalRecyclerView.adapter = CustumeCardAdapter(this, Layout.VERTICAL)
        binding.verticalRecyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}