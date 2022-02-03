package com.example.kotlindagger

import dagger.Subcomponent

@MainScope
@Subcomponent(modules = [MainModule::class])
interface MainSubcomponent {
    fun inject(mainActivity: MainActivity)
}