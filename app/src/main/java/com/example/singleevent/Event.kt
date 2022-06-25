package com.example.singleevent

open class Event<T>(val content: T) {
    var handled: Boolean = false

    fun getContentIfNotHandled(): T? = if (handled) null else {
        handled = true
        content
    }
}