package com.example.costumeideas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.costumeideas.R
import com.example.costumeideas.const.Layout
import com.example.costumeideas.data.DataSource

class CustumeCardAdapter(val context: Context,val layout:Int):RecyclerView.Adapter<CustumeCardAdapter.CustumeViewHolder>(){

    class CustumeViewHolder(val view: View):RecyclerView.ViewHolder(view){

        val imgCustume:ImageView = view.findViewById(R.id.img_custume)
        val txtNameCustume:TextView = view.findViewById(R.id.txt_custume)
        val txtAcessorie:TextView = view.findViewById(R.id.txt_accessorie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustumeViewHolder {

        val layoutInflater = LayoutInflater.from(context)

        var view = when(layout){
            3 ->  layoutInflater.inflate(R.layout.grid_item,parent,false)
            else -> layoutInflater.inflate(R.layout.horizontal_vertical_item,parent,false)
        }
        return CustumeViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustumeViewHolder, position: Int) {

        val custume = DataSource.cutumeList[position]
        holder.imgCustume.setImageResource(custume.custumeDrawbleId)
        holder.txtNameCustume.text = custume.custumeName
        holder.txtAcessorie.text = custume.accesoories
    }

    override fun getItemCount() = DataSource.cutumeList.size
}