package com.example.basics.ui.activities

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.basics.EXTRA_MESSAGE
import com.example.basics.R

class ActivitiesList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities_list)
    }

    /** Called when the user taps the Send button */
    fun sendDataToActivity(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun toLifecycle(view: View) {
        startActivity(Intent(this, LifecycleDemoActivity::class.java))
    }

    fun toSettings(view: View) {
        startActivity(Intent(this, SettingsActivity::class.java))
    }

    fun toCompose(view: View) {
        startActivity(Intent(this, ComposeActivity::class.java))
    }

    fun toAnotherApp1(view: View) {
        val location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California")
        val mapIntent = Intent(Intent.ACTION_VIEW, location)
        startActivity(mapIntent)
    }

    fun toAnotherApp2(view: View) {
        val location = Uri.parse("tel:5551234")
        val mapIntent = Intent(Intent.ACTION_DIAL, location)
        startActivity(mapIntent)
    }

}