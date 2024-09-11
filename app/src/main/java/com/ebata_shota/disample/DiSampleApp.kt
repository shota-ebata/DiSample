package com.ebata_shota.disample

import android.app.Application
import com.ebata_shota.disample.di.component.AppComponent

class DiSampleApp : Application() {

    val appComponent = AppComponent()
}