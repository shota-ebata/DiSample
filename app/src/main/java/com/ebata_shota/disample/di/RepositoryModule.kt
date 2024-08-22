package com.ebata_shota.disample.di

import com.ebata_shota.disample.infra.db.MyDatabase
import com.ebata_shota.disample.infra.repository.UserRepository
import com.ebata_shota.disample.infra.repository.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Repositoryのインスタンスの作り方を知っている
 */
@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    fun provideUserRepository(myDatabase: MyDatabase): UserRepository {
        return UserRepositoryImpl(myDatabase)
    }
}