package com.ebata_shota.disample.di

import com.ebata_shota.disample.domain.repository.LogRepository
import com.ebata_shota.disample.infra.repository.DebugLogRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Repositoryのインスタンスの作り方を知っている
 */
@Module
@InstallIn(SingletonComponent::class)
interface DynamicRepositoryModule {

    @Binds
    fun bindLogRepository(repository: DebugLogRepositoryImpl): LogRepository
}