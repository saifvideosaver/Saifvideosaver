package com.saif.videosaver

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "Welcome to Saif Video Saver!"
        text.textSize = 24f
        text.gravity = Gravity.CENTER

        setContentView(text)
    }
}
