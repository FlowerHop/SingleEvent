package com.example.singleevent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.singleevent.databinding.ActivitySecondBinding

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivitySecondBinding.inflate(layoutInflater).root)
    }
}