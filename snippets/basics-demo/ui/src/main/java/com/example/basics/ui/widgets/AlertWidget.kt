package com.example.basics.ui.widgets

import android.app.AlertDialog
import android.content.Context
import android.util.Log


class AlertWidget {

    companion object {
        fun showAlert(context: Context) {
            AlertDialog.Builder(context)
                .setTitle("Delete entry")
                .setMessage("Are you sure? Deletion is permanent.")
                .setPositiveButton(android.R.string.ok) { dialog, which ->
                    Log.i("TAG", "OK")
                }
                .setNegativeButton(android.R.string.cancel) { dialog, which ->
                    Log.i("TAG", "CANCEL")
                }
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show()
        }
    }

}