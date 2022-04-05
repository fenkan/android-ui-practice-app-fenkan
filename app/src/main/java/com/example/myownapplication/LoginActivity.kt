package com.example.myownapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.myownapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    //defining the variables
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //binding the buttons
        binding.backToMainMenuFromLogin.setOnClickListener {
           finish()
        }
        //making sure the email is not empty
        binding.loginButtonMenu.setOnClickListener {
            if (binding.enterEmailLoginMenu.text.isEmpty() || binding.enterEmailLoginMenu.text.isBlank()) {
            Toast.makeText(this, ("Email cannot be empty"), Toast.LENGTH_LONG).show()
            }else {
                if (!isEmailValid(binding.enterEmailLoginMenu.text.toString())) {
            Toast.makeText(this, "Email format is not valid", Toast.LENGTH_LONG).show()
                }
                else {
                    if (binding.enterPasswordLoginMenu.text.isEmpty() || binding.enterPasswordLoginMenu.text.isBlank()) {
                        Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_LONG).show()
                    }
                    else {
                        Toast.makeText(this, "Login was successful", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
        }

    private fun isEmailValid(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()

    }


}

