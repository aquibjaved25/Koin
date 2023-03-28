package com.koin.di

import com.koin.viewmodel.MainViewModel
import com.koin.viewmodel.Test
import com.koin.viewmodel.TestImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val viewModelModule = module {
    factory { TestImpl() } bind Test::class
    viewModel{  MainViewModel( get() )  }

}