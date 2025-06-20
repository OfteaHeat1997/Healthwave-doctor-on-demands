package com.example.healthwave

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_layout)

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
                    true // Return true to indicate the item selection was handled
                }

                R.id.bottom_diagnosis -> {
                    val intent = Intent(this, BotActivity::class.java)
                    startActivity(intent)
                    true // Return true to indicate the item selection was handled
                }

                else -> false // Return false for unhandled selections
            }
        }
    }
}
