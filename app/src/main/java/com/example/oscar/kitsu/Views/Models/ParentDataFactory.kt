package com.example.oscar.kitsu.Views.Models



object ParentDataFactory{


    private val title =  "Anime Series"

    private fun randomTitle() : String{

        return title
    }

    private fun randomChildren() : List<ChildModel>{
        return ChildDataFactory.getChildren(20)
    }

    fun getParents(count : Int) : List<ParentModel>{
        val parents = mutableListOf<ParentModel>()
        repeat(count){
            val parent = ParentModel(randomTitle(), randomChildren())
            parents.add(parent)
        }
        return parents
    }
}