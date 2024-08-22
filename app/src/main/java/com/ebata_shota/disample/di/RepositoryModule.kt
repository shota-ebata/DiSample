package com.ebata_shota.disample.di

import com.ebata_shota.disample.infra.repository.UserRepository
import com.ebata_shota.disample.infra.repository.UserRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Repositoryのインスタンスの作り方を知っている
 */
@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun bindUserRepository(repository: UserRepositoryImpl): UserRepository
}