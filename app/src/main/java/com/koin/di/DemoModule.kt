package com.koin.di

import com.koin.demo.Car
import com.koin.demo.Engine
import com.koin.demo.Wheel
import org.koin.dsl.module

val demoModule = module {


    factory { Wheel() }
    factory { Engine() }
    factory { Car(get(),get() ) }
    //single { Car() }    //to make this a singleton
}