package com.ebata_shota.disample.di

import com.ebata_shota.disample.infra.repository.UserRepository
import com.ebata_shota.disample.presenter.MainPresenter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


/**
 * Presenterのインスタンスの作り方を知っている
 */
@Module
@InstallIn(ActivityComponent::class)
class PresenterModule {

    @Provides
    fun provideMainPresenter(repository: UserRepository): MainPresenter {
        return MainPresenter(repository)
    }
}