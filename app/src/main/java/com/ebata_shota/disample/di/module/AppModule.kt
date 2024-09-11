package com.ebata_shota.disample.di.module

import com.ebata_shota.disample.infra.db.MyDatabase

/**
 * アプリ全体で利用するインスタンスの作り方を知っているクラス
 */
class AppModule {

    fun provideMyDatabase(): MyDatabase {
        return MyDatabase()
    }
}