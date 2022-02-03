package com.example.kotlindagger

import dagger.Module
import dagger.Provides
import java.util.*

@Module
class ApplicationModule {
    @Provides
    fun provideRandom(): Random = Random()
    @Provides
    fun provideNumberRepository(random: Random) : NumberRepository = NumberRepositoryImpl(random)
}