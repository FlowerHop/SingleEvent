package com.example.singleevent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _userClickEvent: SingleEventLiveData<Any> = SingleEventLiveData()
    val userClickEvent: LiveData<Any> = _userClickEvent

    fun click() {
//        _userClickEvent.setValue(true)
        _userClickEvent.call()
//        _userClickEvent.value = true
    }
}