package com.example.myownapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.myownapplication.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    //defining the variables
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignupBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //binding the buttons

        binding.backToMainMenuFromSignup.setOnClickListener {
            finish()
        }
        binding.signupMenuButton.setOnClickListener {
            if (binding.signupName.text.isEmpty() || binding.signupName.text.isBlank()) {
                Toast.makeText(this, ("Name cannot be empty"), Toast.LENGTH_LONG).show()
            }else {
                if (binding.signupEmail.text.isEmpty() ||binding.signupEmail.text.isBlank() ) {
                    Toast.makeText(this, ("Email cannot be empty"), Toast.LENGTH_LONG).show()
                }else {
                    if (!isEmailValid(binding.signupEmail.text.toString())) {
                        Toast.makeText(this, "Email format is not valid", Toast.LENGTH_LONG).show()
                    }else {
                        if (binding.signupPassword.text.isEmpty() ||binding.signupPassword.text.isBlank()) {
                            Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_LONG).show()
                        }else {
                            if (!isPasswordValid(binding.signupPassword.text.toString())) {
                                Toast.makeText(this, "Password must be at least 6 characters", Toast.LENGTH_LONG).show()

                            }
                            else {
                                Toast.makeText(this, "Sign up was successful", Toast.LENGTH_LONG).show()
                        }


                    }
                }
            }
        }
    }


    }
}
    private fun isEmailValid(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
}
    private fun isPasswordValid(password: String): Boolean {
        return password.length >= 6

    }