package com.example.basics.ui.widgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.app.DatePickerDialog

import android.widget.DatePicker

import android.R
import android.app.DatePickerDialog.OnDateSetListener

import android.widget.EditText
import java.text.SimpleDateFormat
import java.util.*


class WidgetsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.basics.R.layout.activity_widgets)
    }

    fun showToast(view: View) {
        Toast.makeText(this, "Hello toast!", Toast.LENGTH_SHORT).show()
    }

    fun toMenu(view: View) {
        startActivity(Intent(this, MenuActivity::class.java))
    }

    fun showAlert(view: View) {
        AlertWidget.showAlert(this)
    }

    fun pickDate(view: View) {
        DatePickerWidget.pickDate(this)
    }

}