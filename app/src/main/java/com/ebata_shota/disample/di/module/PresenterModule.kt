package com.ebata_shota.disample.di.module

import com.ebata_shota.disample.infra.repository.UserRepository
import com.ebata_shota.disample.presenter.MainPresenter

/**
 * Repositoryインスタンスの作り方を知っているクラス
 */
class PresenterModule {

    fun provideMainPresenter(repository: UserRepository): MainPresenter {
        return MainPresenter(repository)
    }
}