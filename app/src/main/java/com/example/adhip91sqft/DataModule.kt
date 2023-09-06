package com.example.adhip91sqft

import com.example.adhip91sqft.networking.Retrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun provideRetrofit() : Retrofit{
        return Retrofit
    }
}