package com.koin.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel constructor(private val test: Test) : ViewModel(){

    fun getTest(){
        test.getTest()
    }

}