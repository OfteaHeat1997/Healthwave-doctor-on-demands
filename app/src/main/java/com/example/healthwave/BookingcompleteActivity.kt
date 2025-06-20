package com.example.healthwave

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class BookingcompleteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_is_set)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottom_home -> {
                    // Go back to the ActivityHome
                    val intent = Intent(this, ActivityHome::class.java)
                    startActivity(intent)
                    true
                }

                R.id.bottom_virtualconsult -> {
                    // Do nothing, you are already in VirtualConsultActivity
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

        // Find the CardView for appointment information
        val appointmentCardView = findViewById<CardView>(R.id.cardViewApointmentSet)

        // Initially hide the CardView
        appointmentCardView.visibility = View.INVISIBLE

        // Set click listener for the "Set Appointment" button
        val setAppointmentButton = findViewById<Button>(R.id.SetAppointmentButton)
        setAppointmentButton.setOnClickListener {
            // Show the CardView when the "Set Appointment" button is clicked
            appointmentCardView.visibility = View.VISIBLE
        }

        // Set click listener for the "Close" button in the CardView
        val closeButton = findViewById<Button>(R.id.closeButton)
        closeButton.setOnClickListener {
            // Hide the CardView when the "Close" button is clicked
            appointmentCardView.visibility = View.INVISIBLE
        }
    }
}
