package com.example.healthwave

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Find the button by its ID
        val button = findViewById<Button>(R.id.buttonNavigate)

        // Set a click listener on the button
        button.setOnClickListener {
            // Handle button click event
            onButtonClick()
        }
    }

    /**
     * onButtonClick is called when the button is clicked.
     */
    private fun onButtonClick() {
        // Perform the desired action when the button is clicked
        // For example, navigate to the HomeActivity
        navigateToHomeActivity()
    }

    /**
     * navigateToHomeActivity navigates to the BaseActivity.
     */
    private fun navigateToHomeActivity() {
        // Create an intent to start the botActivity
        val intent = Intent(this, ActivityHome::class.java)
        startActivity(intent)
    }
}

