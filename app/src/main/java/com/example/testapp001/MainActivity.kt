package com.example.testapp001

import androidx.appcompat.app.AppCompatActivity
import android.R
import android.content.Intent
import android.widget.EditText
import android.os.Bundle as Bundle
import android.view.View as View

const val EXTRA_MESSAGE = "com.example.testapp001.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        // Do something in response to button
    }
}

