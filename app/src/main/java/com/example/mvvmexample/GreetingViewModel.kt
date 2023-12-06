package com.example.mvvmexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class GreetingViewModel : ViewModel() {
    private val _greeting = MutableLiveData<GreetingModel>()
    val greeting: LiveData<GreetingModel> get() = _greeting

    fun setGreeting(name: String) {
        _greeting.value = GreetingModel(name)
    }
}
