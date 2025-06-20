package com.example.healthwave

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class ActivityHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottom_home -> {
                    // No need to navigate to the same activity
                    true
                }
                R.id.bottom_virtualconsult -> {
                    val intent = Intent(this, VirtualConsultActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.bottom_diagnosis -> {
                    val intent = Intent(this, BotActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        // Find the button by its ID
        val button = findViewById<Button>(R.id.buttonBook)

        // Set a click listener on the button
        button.setOnClickListener {
            // Handle button click event
            navigateToBookActivity()
        }

        // Find the "Call" button by its ID
        val buttonCall = findViewById<Button>(R.id.buttonCall)

        // Set a click listener on the "Call" button
        buttonCall.setOnClickListener {
            // Start the NotificationActivity when the button is clicked
            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent)
        }

        // Find the "SYMPTOMS" button by its ID
        val buttonSymptoms = findViewById<Button>(R.id.button)

        // Set a click listener on the "SYMPTOMS" button
        buttonSymptoms.setOnClickListener {
            // Start the BotActivity when the button is clicked
            val intent = Intent(this, BotActivity::class.java)
            startActivity(intent)
        }

        // Find the CardView for Notification by its ID
        val cardViewNotification = findViewById<CardView>(R.id.cardViewNotification)

        // Set a click listener on the CardView for Notification
        cardViewNotification.setOnClickListener {
            // Start the NotificationActivity when the CardView is clicked
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        // Find the CardView for Profile by its ID
        val cardViewProfile = findViewById<CardView>(R.id.cardViewProfile)

        // Set a click listener on the CardView for Profile
        cardViewProfile.setOnClickListener {
            // Start the ProfileActivity when the CardView is clicked
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    private fun navigateToBookActivity() {
        // Create an intent to start the BookActivity
        val intent = Intent(this, BookActivity::class.java)
        startActivity(intent)
    }
}
