package com.example.healthwave

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class DeseaseDiagnosisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desease_diagnosis)


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottom_home -> {  val intent = Intent(this, ActivityHome::class.java)
                    startActivity(intent)
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
        val button = findViewById<Button>(R.id.buttonMakeAppointment)

        // Set a click listener on the button
        button.setOnClickListener {
            // Handle button click event
            navigateToBookActivity()
        }
    }

    private fun navigateToBookActivity() {
        // Create an intent to start the BookActivity
        val intent = Intent(this, BookActivity::class.java)
        startActivity(intent)
    }
}



