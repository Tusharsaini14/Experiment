package com.example.experiment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VAdapter(val layouts: IntArray) : RecyclerView.Adapter<PageHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageHolder {
        return PageHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.welcome_slide1, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PageHolder, position: Int) {

    }

    override fun getItemCount(): Int = layouts.size

}

class PageHolder(view: View) : RecyclerView.ViewHolder(view) {

}
