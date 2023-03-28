package com.koin.di

import com.koin.demo.interfaces.DemoImpl
import com.koin.demo.interfaces.DemoOne
import com.koin.demo.interfaces.DemoTwo
import com.koin.demo.interfaces.Main
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val interfaceModule = module {
   // 1st way. not recommended
    //factory { DemoImpl() as DemoOne }

    // 2nd way.
    //factory <DemoOne> { DemoImpl() }

    // 3rd way.
    //factory { DemoImpl() } bind DemoOne::class
    factory { DemoImpl() } binds arrayOf(DemoOne::class,DemoTwo::class)
    factory { Main(get(),get()) }
}