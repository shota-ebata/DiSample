package com.ebata_shota.disample.di.module

import com.ebata_shota.disample.infra.db.MyDatabase
import com.ebata_shota.disample.infra.repository.UserRepository
import com.ebata_shota.disample.infra.repository.UserRepositoryImpl

/**
 * Repositoryインスタンスの作り方を知っているクラス
 */
class RepositoryModule {

    fun provideUserRepository(myDatabase: MyDatabase): UserRepository {
        return UserRepositoryImpl(
            database = myDatabase
        )
    }
}