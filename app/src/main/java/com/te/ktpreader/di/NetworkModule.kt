package com.te.ktpreader.di

import com.te.ktpreader.data.remote.VerihubsApiService
import com.te.ktpreader.data.remote.VerihubsClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    
    @Provides
    @Singleton
    fun provideVerihubsApiService(): VerihubsApiService {
        return VerihubsClient.apiService
    }
}
