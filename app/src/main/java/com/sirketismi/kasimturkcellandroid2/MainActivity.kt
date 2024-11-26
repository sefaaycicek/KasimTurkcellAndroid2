package com.sirketismi.kasimturkcellandroid2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sirketismi.kasimturkcellandroid2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        //binding.lifecycleOwner = this

        setContentView(binding.root)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(binding.layoutContainer.id, CustomComponentFragment())
        transaction.commit()


    }
}