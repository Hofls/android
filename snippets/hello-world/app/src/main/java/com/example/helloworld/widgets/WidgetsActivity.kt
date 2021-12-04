package com.example.helloworld.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.helloworld.R

class WidgetsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widgets)
    }

    fun showToast(view: View) {
        Toast.makeText(this, "Hello toast!", Toast.LENGTH_SHORT).show()
    }
}