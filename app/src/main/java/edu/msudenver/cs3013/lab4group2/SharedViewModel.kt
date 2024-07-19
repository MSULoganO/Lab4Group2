package edu.msudenver.cs3013.lab4group2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
//mapdata is the latlng coords
    private val mapData = MutableLiveData<String>()
    val parked : LiveData<String> = mapData
    init {
        mapData.postValue(toString())
    }

    fun updateParked(location: String) {
        mapData.value = location
    }
}