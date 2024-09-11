package com.ebata_shota.disample

import android.app.Application
import com.ebata_shota.disample.di.component.AppComponent
import com.ebata_shota.disample.di.module.AppModule
import com.ebata_shota.disample.di.module.RepositoryModule

class DiSampleApp : Application() {

    val appComponent = AppComponent(
        appModule = AppModule(),
        repositoryModule = RepositoryModule()
    )
}