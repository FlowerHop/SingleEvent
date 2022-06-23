package com.example.singleevent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _userClickEvent = MutableLiveData(false)
    val userClickEvent: LiveData<Boolean> = _userClickEvent

    fun click() {
        _userClickEvent.value = true
    }
}