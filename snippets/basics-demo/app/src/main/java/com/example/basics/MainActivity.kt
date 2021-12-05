package com.example.basics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.basics.activities.ActivitiesList
import com.example.basics.fragments.FragmentsActivity
import com.example.basics.widgets.WidgetsActivity

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toActivities(view: View) {
        startActivity(Intent(this, ActivitiesList::class.java))
    }

    fun toContainers(view: View) {
        startActivity(Intent(this, ContainersActivity::class.java))
    }

    fun toFragments(view: View) {
        startActivity(Intent(this, FragmentsActivity::class.java))
    }

    fun toWidgets(view: View) {
        startActivity(Intent(this, WidgetsActivity::class.java))
    }

}