package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.helloworld.activities.ActivitiesList
import com.example.helloworld.activities.DisplayMessageActivity
import com.example.helloworld.widgets.WidgetsActivity

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toActivities(view: View) {
        startActivity(Intent(this, ActivitiesList::class.java))
    }

    fun toWidgets(view: View) {
        startActivity(Intent(this, WidgetsActivity::class.java))
    }

}