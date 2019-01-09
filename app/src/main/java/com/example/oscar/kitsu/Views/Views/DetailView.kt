package com.example.oscar.kitsu.Views.Views

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.text.method.MovementMethod
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import com.example.oscar.kitsu.R

import kotlinx.android.synthetic.main.activity_detail_view.*

class DetailView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_view)
        val textView = findViewById<TextView>(R.id.txtSynopsis)
        textView.movementMethod = ScrollingMovementMethod.getInstance()


    }

}
