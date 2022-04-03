package com.example.myownapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.TextView
import android.widget.Toast
import com.example.myownapplication.databinding.ActivityLoginBinding
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {

    //defining the variables
    private lateinit var binding: ActivityLoginBinding





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState
        )
        setContentView(binding.root)


        //binding the buttons
        binding.backToMainMenuFromLogin.setOnClickListener {
            val intentLogin = Intent(this, MainActivity::class.java)
            startActivity(intentLogin)
        }





        }
    }
