package com.example.healthwave

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigationActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

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
    }
}