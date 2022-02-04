package com.example.kotlindagger

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainProviderModule {
    @MainScope
    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun contributeMyActivityInjector() : MainActivity
}