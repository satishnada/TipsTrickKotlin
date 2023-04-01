package com.satish.tipstrickkotlin.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _breakFastList = MutableLiveData<List<String>>()
    val breakFastList: LiveData<List<String>> = _breakFastList

    /**
     * getBreakFastList: List Of String as name of filtered break fast
     * @param breakFastList: List<String> - list of mixed break fast Veg and Non-Veg
     * @param foodType: String - as Higher Order Function as lambda expression
     */
    fun getBreakFastList(breakFastList: List<String>, foodType: (String) -> Boolean) {
        _breakFastList.value = breakFastList.filter(foodType)
    }
}