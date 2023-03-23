package com.koin.container

import com.koin.demo.Car
import org.koin.core.component.get
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Component : KoinComponent{

    //lazily
    val car:Car by inject()

    //eagerly
    val car1:Car  = get()
}