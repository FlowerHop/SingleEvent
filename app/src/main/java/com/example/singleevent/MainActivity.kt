package com.example.singleevent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.singleevent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel by viewModels<MainViewModel>()

    private val eventLogger = Observer<Event<Boolean>> { event ->
        Log.d("EventLogger", ": ${event.content}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.setOnClickListener {
            mainViewModel.click()
        }

        mainViewModel.userClickEvent.observe(this) {
            it.getContentIfNotHandled()?.let {
                startActivity(Intent(this, SecondActivity::class.java))
            }
        }

        mainViewModel.userClickEvent.observe(this, eventLogger)
    }
}