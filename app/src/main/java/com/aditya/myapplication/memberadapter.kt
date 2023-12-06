package com.aditya.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class memberadapter(private val exampleList: List<infomembers>) : RecyclerView.Adapter<memberadapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): memberadapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val item = inflater.inflate(R.layout.memberscard,parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: memberadapter.ViewHolder, position: Int) {
        val item = exampleList[position]
        holder.name.text = item.name
        holder.number.text= item.number.toString()
    }

    override fun getItemCount(): Int {
        return exampleList.size
    }
    class ViewHolder(private val a : View) : RecyclerView.ViewHolder(a) {
        val name = a.findViewById<TextView>(R.id.Name)
        val number = a.findViewById<TextView>(R.id.number)



    }
}