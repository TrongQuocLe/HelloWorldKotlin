package com.example.helloworldkotlin

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate


class MainActivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Log.v("Hello World", "Button clicked")
            Toast.makeText(this, "Hello to you too", Toast.LENGTH_LONG).show()
        }

        // initializing all our variables.
        radioGroup = findViewById<RadioGroup>(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            // on radio button check change
            when (checkedId) {
                R.id.radioButtonLight -> {
                    // changing the theme to light mode.
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
                R.id.radioButtonDark -> {
                    // changing the theme to dark mode.
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
            }
        }
    }
}