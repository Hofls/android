package com.example.basics.ui.containers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

import android.util.Log

/** Swipe down and look at the logs */
class SwipeRefreshActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.basics.R.layout.activity_swipe_refresh)

        val pullToRefresh = findViewById<SwipeRefreshLayout>(com.example.basics.R.id.pullToRefresh)
        pullToRefresh.setOnRefreshListener {
            Log.i("TAG", "onRefresh")
            pullToRefresh.isRefreshing = false
        }
    }

}