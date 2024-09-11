package com.ebata_shota.disample.di.component

import com.ebata_shota.disample.di.module.AppModule
import com.ebata_shota.disample.di.module.RepositoryModule
import com.ebata_shota.disample.infra.db.MyDatabase
import com.ebata_shota.disample.infra.repository.UserRepository

/**
 * インスタンスの生成
 * ＆
 * アプリが生存している間だけインスタンスを保持
 */
class AppComponent(
    appModule: AppModule,
    repositoryModule: RepositoryModule
) {
    private val myDatabase: MyDatabase = appModule.provideMyDatabase()
    private val userRepository: UserRepository = repositoryModule.provideUserRepository(getMyDatabase())

    fun getMyDatabase(): MyDatabase {
        return myDatabase
    }

    fun getUserRepository(): UserRepository {
        return userRepository
    }
}