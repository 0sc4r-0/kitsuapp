package com.example.oscar.kitsu.Views.Models

import com.example.oscar.kitsu.R


object ChildDataFactory{



    private val title =  "AnimeSerie"

    private fun randomTitle() : String{
        return title
    }

    private fun getImage() : Int{
        return R.drawable.ic_image
    }

    fun getChildren(count : Int) : List<ChildModel>{
        val children = mutableListOf<ChildModel>()
        repeat(count){
            val child = ChildModel(getImage(), randomTitle())
            children.add(child)
        }
        return children
    }


}