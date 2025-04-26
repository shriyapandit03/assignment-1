package com.example.mygridapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "MyGridIntentApp"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.openBrowserButton)
        button.setOnClickListener {
            Log.d(TAG, "Button clicked: Opening browser")
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Log.e(TAG, "No app can handle this intent!")
            }
        }
    }
}
