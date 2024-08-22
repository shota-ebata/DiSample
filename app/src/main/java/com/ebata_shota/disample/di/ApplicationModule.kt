package com.ebata_shota.disample.di

import com.ebata_shota.disample.infra.db.MyDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    @Provides
    fun provideMyDatabase(): MyDatabase {
        return MyDatabase()
    }
}