package com.ebata_shota.disample.di.component

import com.ebata_shota.disample.infra.db.MyDatabase
import com.ebata_shota.disample.infra.repository.UserRepository
import com.ebata_shota.disample.infra.repository.UserRepositoryImpl

/**
 * インスタンスの生成
 * ＆
 * アプリが生存している間だけインスタンスを保持
 */
class AppComponent {
    private val myDatabase: MyDatabase = MyDatabase()
    private val userRepository: UserRepository = UserRepositoryImpl(
        database = getMyDatabase()
    )

    fun getMyDatabase(): MyDatabase {
        return myDatabase
    }

    fun getUserRepository(): UserRepository {
        return userRepository
    }
}