package com.example.basics.ui.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import com.example.basics.R

/** Dropdown/Popup menu */
class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val menuButton: Button = findViewById(R.id.menuButton)
        menuButton.setOnClickListener {
            showPopup(menuButton)
        }
    }

    private fun showPopup(view: View) {
        val popup = PopupMenu(this, view)
        popup.inflate(R.xml.header_menu)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item: MenuItem? ->

            when (item!!.itemId) {
                R.id.header1 -> {
                    Toast.makeText(this@MenuActivity, item.title, Toast.LENGTH_SHORT).show()
                }
                R.id.header2 -> {
                    Toast.makeText(this@MenuActivity, item.title, Toast.LENGTH_SHORT).show()
                }
                R.id.header3 -> {
                    Toast.makeText(this@MenuActivity, item.title, Toast.LENGTH_SHORT).show()
                }
            }

            true
        })

        popup.show()
    }
}