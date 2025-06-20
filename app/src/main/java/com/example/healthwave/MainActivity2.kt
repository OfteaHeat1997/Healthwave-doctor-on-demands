package com.example.healthwave
import android.view.View
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
        // Find the button by its ID
        val button = findViewById<Button>(R.id.buttonBook)


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
        navigateToBookActivity()
    }

    /**
     * navigateToHomeActivity navigates to the BaseActivity.
     */
    private fun navigateToBookActivity() {
        // Create an intent to start the HomeActivity
        val intent = Intent(this, BookActivity::class.java)
        startActivity(intent)
    }
}





