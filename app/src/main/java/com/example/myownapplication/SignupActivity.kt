package com.example.myownapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myownapplication.databinding.ActivityLoginBinding
import com.example.myownapplication.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    //defining the variables
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //binding the buttons

        binding.backToMainMenuFromSignup.setOnClickListener {
            val intentSignup = Intent(this, MainActivity:: class.java)
            startActivity(intentSignup)
        }
    }
}