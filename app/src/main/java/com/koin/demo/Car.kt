package com.koin.demo

import android.util.Log

class Car constructor(private val engine: Engine,private val wheel: Wheel){
    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("main","car is running...")
    }
}

class Engine {
    fun getEngine(){
        Log.d("main","engine started...")
    }
}

class Wheel {
    fun getWheel(){
        Log.d("main","wheel started...")
    }
}