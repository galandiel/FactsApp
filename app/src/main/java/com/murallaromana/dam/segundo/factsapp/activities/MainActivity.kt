package com.murallaromana.dam.segundo.factsapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.murallaromana.dam.segundo.factsapp.R
import com.murallaromana.dam.segundo.factsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}