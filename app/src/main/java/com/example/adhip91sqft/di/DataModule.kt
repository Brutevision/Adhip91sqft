package com.example.adhip91sqft.di

import com.example.adhip91sqft.networking.domain.Repository
import com.example.adhip91sqft.networking.data.RepositoryImpl
import com.example.adhip91sqft.networking.Retrofit
import dagger.Binds
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

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {
    @Binds
    abstract fun provideRepo(repositoryImpl: RepositoryImpl): Repository
}
