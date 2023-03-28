package com.koin.container

import com.koin.demo.Car
import com.koin.demo.Engine
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Component : KoinComponent{

    //lazily
    val car:Car by inject()

    val engine:Engine by inject()
}