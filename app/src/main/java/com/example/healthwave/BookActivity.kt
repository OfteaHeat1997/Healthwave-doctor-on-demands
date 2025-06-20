package com.example.healthwave

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.Calendar

class BookActivity : AppCompatActivity() {
    private lateinit var dateTimeTextView: TextView
    private lateinit var calendar: Calendar
    private lateinit var buttonDialog: Button
    private lateinit var buttonMakeAppointment: Button

    private var isDateTimeSelected = false // Flag to track if date and time are selected

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

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

        dateTimeTextView = findViewById(R.id.textDateTime)
        calendar = Calendar.getInstance()
        buttonDialog = findViewById(R.id.buttonDialog1)
        buttonMakeAppointment = findViewById(R.id.buttonMakeAppointment) // Add this line
        buttonMakeAppointment.isEnabled = false // Initially disable the button

        buttonDialog.setOnClickListener {
            openDatePicker()
        }

        buttonMakeAppointment.setOnClickListener { // Handle button click
            if (isDateTimeSelected) {
                // Start the BookingIsSet activity only if date and time are selected
                val intent = Intent(this, BookingcompleteActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun openDatePicker() {
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this, R.style.DialogTheme,
            DatePickerDialog.OnDateSetListener { _, year, month, day ->
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, month)
                calendar.set(Calendar.DAY_OF_MONTH, day)
                openTimePicker()
            }, year, month, day
        )
        datePickerDialog.show()
    }

    private fun openTimePicker() {
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(this, R.style.DialogTheme,
            TimePickerDialog.OnTimeSetListener { _, hour, minute ->
                calendar.set(Calendar.HOUR_OF_DAY, hour)
                calendar.set(Calendar.MINUTE, minute)
                updateDateTimeText()

                // Enable the "Make Appointment" button when date and time are selected
                isDateTimeSelected = true
                buttonMakeAppointment.isEnabled = true
            }, hour, minute, false
        )
        timePickerDialog.show()
    }

    private fun updateDateTimeText() {
        val dateFormat = java.text.SimpleDateFormat("yyyy.MM.dd HH:mm", java.util.Locale.getDefault())
        val formattedDateTime = dateFormat.format(calendar.time)
        dateTimeTextView.text = formattedDateTime
    }
}
