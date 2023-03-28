package com.koin.container

import com.koin.demo.Car
import com.koin.demo.Engine
import com.koin.demo.interfaces.Main
import com.koin.viewmodel.MainViewModel
import com.koin.viewmodel.Test
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Component : KoinComponent{

    //lazily
    val car:Car by inject()

    val engine:Engine by inject()

    val main: Main by inject()

    val mainViewModel:MainViewModel by inject()

    val test: Test by inject()
}