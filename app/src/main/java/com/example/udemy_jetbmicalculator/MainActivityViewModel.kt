package com.example.udemy_jetbmicalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

/*
* BMI計算アプリ画面のViewModel
* **/
class MainActivityViewModel : ViewModel() {
    // 身長
    var height by mutableStateOf("")
    // 体重
    var weight by mutableStateOf("")
}