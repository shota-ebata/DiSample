package com.ebata_shota.disample.di.component

import com.ebata_shota.disample.di.module.PresenterModule
import com.ebata_shota.disample.presenter.MainPresenter
import com.ebata_shota.disample.ui.MainActivity

/**
 * インスタンスの生成を
 * Moduleや他のComponentに依頼する
 * ＆
 * Activityが生存している間だけインスタンスを保持
 */
class ActivityComponent(
    appComponent: AppComponent,
    presenterModule: PresenterModule
) {

    private val mainPresenter: MainPresenter by lazy {
        presenterModule.provideMainPresenter(appComponent.getUserRepository())
    }

    fun inject(mainActivity: MainActivity) {
        mainActivity.presenter = mainPresenter
    }
}