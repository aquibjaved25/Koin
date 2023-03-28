package com.koin.viewmodel

import android.util.Log

interface Test {
    fun getTest()
}

class TestImpl: Test{
    override fun getTest() {
        Log.d("main","Hey ViewModel")
    }

}