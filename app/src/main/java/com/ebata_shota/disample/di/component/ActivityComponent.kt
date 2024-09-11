package com.ebata_shota.disample.di.component

import com.ebata_shota.disample.presenter.MainPresenter
import com.ebata_shota.disample.ui.MainActivity

/**
 * インスタンスの生成
 * ＆
 * Activityが生存している間だけインスタンスを保持
 */
class ActivityComponent(
    appComponent: AppComponent
) {

    private val mainPresenter: MainPresenter = MainPresenter(appComponent.getUserRepository())

    fun inject(mainActivity: MainActivity) {
        mainActivity.presenter = mainPresenter
    }
}