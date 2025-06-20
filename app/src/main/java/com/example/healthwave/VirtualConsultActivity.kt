package com.example.healthwave

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class VirtualConsultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_virtual_consult)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottom_home -> {  val intent = Intent(this, ActivityHome::class.java)
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

        // Get the CardView by its ID
        val cardiologyCardView = findViewById<CardView>(R.id.cardViewCardiology)

        // Add an OnClickListener to the CardView
        cardiologyCardView.setOnClickListener {
            // Create an Intent to start the new activity (replace NewActivity::class.java with the actual class name)
            val intent = Intent(this, DeseaseDiagnosisActivity::class.java)

            // You can pass data to the new activity using extras if needed
            // intent.putExtra("key", "value")

            // Start the new activity
            startActivity(intent)
        }
    }
}
