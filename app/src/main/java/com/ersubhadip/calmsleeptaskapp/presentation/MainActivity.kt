package com.ersubhadip.calmsleeptaskapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ersubhadip.calmsleeptaskapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}