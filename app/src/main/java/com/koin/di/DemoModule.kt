package com.koin.di

import com.koin.demo.Car
import org.koin.dsl.module

val demoModule = module {

    factory { Car() }
    //single { Car() }    //to make this a singleton
}