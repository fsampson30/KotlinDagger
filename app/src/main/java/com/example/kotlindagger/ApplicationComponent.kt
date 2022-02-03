package com.example.kotlindagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun createMainSubcomponent(): MainSubcomponent
}