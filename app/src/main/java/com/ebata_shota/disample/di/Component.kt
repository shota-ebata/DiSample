package com.ebata_shota.disample.di

import com.ebata_shota.disample.infra.db.MyDatabase
import com.ebata_shota.disample.infra.repository.UserRepositoryImpl
import com.ebata_shota.disample.presenter.MainPresenter
import com.ebata_shota.disample.ui.MainActivity

/**
 * インスタンスの生成と保持
 */
class Component {

    private val mainPresenter = MainPresenter(
        userRepository = UserRepositoryImpl(
            database = MyDatabase()
        )
    )

    fun inject(mainActivity: MainActivity) {
        mainActivity.presenter = mainPresenter
    }
}