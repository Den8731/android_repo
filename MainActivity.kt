package com.example.app_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceView
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    var count = 0
    private var buttonAction: Button? = null
    private var surface: SurfaceView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonAction = findViewById<Button>(R.id.performTask)


    }

    fun onClick(view: View) {

        count++
        val displayText:TextView = findViewById<TextView>(R.id.textView)
        displayText.setText(count.toString())
    }

    fun AddAction(view: View) {
        val fabButton: View = findViewById(R.id.fab)
        val DURATION = 0
        fabButton.setOnClickListener(){
            Snackbar.make(view, "Here's a snackbar", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
        }


    }
}