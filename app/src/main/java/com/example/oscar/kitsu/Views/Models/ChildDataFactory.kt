package com.example.oscar.kitsu.Views.Models

import com.example.oscar.kitsu.R
import java.util.*

object ChildDataFactory{

    private val random = Random()

    private val titles =  arrayListOf( "AnimeSerie")

    private fun randomTitle() : String{
        val index = random.nextInt(titles.size)
        return titles[index]
    }

    private fun randomImage() : Int{
        return R.drawable.ic_image
    }

    fun getChildren(count : Int) : List<ChildModel>{
        val children = mutableListOf<ChildModel>()
        repeat(count){
            val child = ChildModel(randomImage(), randomTitle())
            children.add(child)
        }
        return children
    }


}