package com.example.singleevent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _userClickEvent: MutableLiveData<Event<Boolean>> = MutableLiveData()
    val userClickEvent: LiveData<Event<Boolean>> = _userClickEvent

    fun click() {
        _userClickEvent.value = Event(true)
    }
}