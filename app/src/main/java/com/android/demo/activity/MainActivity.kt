package com.android.demo.activity

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.android.demo.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showSnakBar()
    }

    fun showSnakBar(){
        // Instead of findView(R.id.parentPanel) as ConstraintLayout
        val snackbar = Snackbar
                .make(parentPanel, "Welcome to Android", Snackbar.LENGTH_LONG)
        snackbar.show()
    }
}
