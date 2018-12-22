package com.example.oscar.kitsu.Views.Views.Adapters


import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.oscar.kitsu.R
import com.example.oscar.kitsu.Views.Models.ChildModel
import kotlinx.android.synthetic.main.child_recycler.view.*

class ChildAdapter(private val children : List<ChildModel>)
    : RecyclerView.Adapter<ChildAdapter.ViewHolder>(){
    val context = this
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =  LayoutInflater.from(parent.context)
            .inflate(R.layout.child_recycler,parent,false)
        return ViewHolder(v)
    }



    override fun getItemCount(): Int {
        return children.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val child = children[position]
        holder.imageView.setImageResource(child.image)
        holder.textView.text = child.title
        holder.imageView.setOnClickListener {this
            onClick()
        }
    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val textView : TextView = itemView.child_textView
        val imageView: ImageView = itemView.child_imageView
    }

    fun onClick(){
            Log.i( "","image pressed")
        //when image pressed create the new fragment
    }
}