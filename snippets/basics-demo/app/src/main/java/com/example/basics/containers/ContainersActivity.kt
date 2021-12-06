package com.example.basics.containers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.basics.R
import com.example.basics.containers.fragments.FragmentsActivity
import com.example.basics.containers.recycler.view.RecyclerViewActivity

class ContainersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_containers)
    }

    fun toFragments(view: View) {
        startActivity(Intent(this, FragmentsActivity::class.java))
    }

    fun toRecyclerView(view: View) {
        startActivity(Intent(this, RecyclerViewActivity::class.java))
    }

    fun toScrollView(view: View) {
        startActivity(Intent(this, ScrollViewActivity::class.java))
    }


}