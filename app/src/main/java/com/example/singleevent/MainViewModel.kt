package com.example.singleevent

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val _userClickEvent: MutableSharedFlow<String> = MutableSharedFlow()
    val userClickEvent: SharedFlow<String> = _userClickEvent

    fun click() {
        viewModelScope.launch {
            _userClickEvent.emit("clicked")
        }
    }
}