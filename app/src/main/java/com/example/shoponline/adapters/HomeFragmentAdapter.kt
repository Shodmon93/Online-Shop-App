package com.example.shoponline.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoponline.R

class HomeFragmentAdapter : RecyclerView.Adapter<HomeFragmentAdapter.HomeViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
       return HomeViewHolder(
           LayoutInflater.from(parent.context)
               .inflate(R.layout.home_recycler_view,parent,false)
       )
    }

    override fun getItemCount(): Int {
       return 10
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {

    }

    inner class HomeViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){


    }


}