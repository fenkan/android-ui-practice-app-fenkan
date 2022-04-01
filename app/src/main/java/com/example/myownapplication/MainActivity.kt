package com.example.myownapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myownapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    //defining the variables
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.loginButton.setOnClickListener{
            val intent = Intent(this, LoginActivity:: class.java)
            startActivity(intent)
        }




    }




}
