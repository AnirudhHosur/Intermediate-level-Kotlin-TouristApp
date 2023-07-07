package com.example.navigationdrawerapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

/*
Purpose:
    Represents the login screen of the application where users can enter their credentials to login.
    If the entered username and password match the predefined values, the user is directed to MainActivity.
    Otherwise, an error message is displayed.

Functions:
    onCreate: void - Called when the activity is created.
        Sets the layout of the activity and handles the login functionality.

Params:
    savedInstanceState: Bundle? - The previously saved state of the activity, or null if it is the first creation.

Return:
    None
*/
class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Check if the entered username and password match the predefined values
            if (username == "Anirudh" && password == "B00899369") {
                // Login successful, navigate to MainActivity
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
                finish() // Optional: Finish the LoginActivity so the user can't go back to it
            } else {
                Toast.makeText(this@LoginActivity, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}