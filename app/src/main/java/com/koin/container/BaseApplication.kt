package com.koin.container

import android.app.Application
import com.koin.di.demoModule
import com.koin.di.interfaceModule
import org.koin.core.context.startKoin

class BaseApplication :Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin{
            modules(demoModule, interfaceModule)
        }

    }

}