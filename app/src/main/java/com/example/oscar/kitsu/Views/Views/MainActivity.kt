package com.example.oscar.kitsu

import android.content.Intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

import android.widget.LinearLayout
import com.example.oscar.kitsu.Views.Models.ParentDataFactory

import com.example.oscar.kitsu.Views.Views.Adapters.ParentAdapter
import com.example.oscar.kitsu.Views.Views.DetailView
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()

    }
    private fun initRecycler(){
        recyclerView = rv_parent

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayout.VERTICAL, false)
            adapter = ParentAdapter(ParentDataFactory.getParents(3))
        }


    }

    fun onClickDetail(v :View){
        val intent = Intent(this,DetailView::class.java)
        startActivity(intent)
    }

}
