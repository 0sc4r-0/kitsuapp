package com.example.oscar.kitsu

import android.content.Intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View

import android.widget.LinearLayout
import com.example.oscar.kitsu.Views.Models.ParentDataFactory

import com.example.oscar.kitsu.Views.Views.Adapters.ParentAdapter
import com.example.oscar.kitsu.Views.Views.DetailView
import com.example.oscar.kitsu.Views.retrofit.AnimeData
import com.example.oscar.kitsu.Views.retrofit.Api
import com.example.oscar.kitsu.Views.retrofit.Data
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    val baseURL = "https://kitsu.io/api/edge/"
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
        getAnimes()

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

    fun getAnimes(){
        var retrofit:Retrofit = Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var api: Api    = retrofit.create(Api::class.java)
        var call : Call<AnimeData> = api.data
        call.enqueue(object : Callback<AnimeData>{
            override fun onFailure(call: Call<AnimeData>, t: Throwable) {
                Log.v("Error", t.toString())
            }

            override fun onResponse(call: Call<AnimeData>, response: Response<AnimeData>) {
                var animeData : AnimeData? = response.body()
                Log.i("",animeData?.toString())
            }


        })


    }

}
