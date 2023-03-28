package com.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.koin.container.Component
import com.koin.demo.Car
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    //private val car:Car by inject()
    private val component = Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.car.getCar()
        component.main.getDemo()
    }
}