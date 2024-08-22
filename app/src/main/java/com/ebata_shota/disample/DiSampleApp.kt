package com.ebata_shota.disample

import android.app.Application
import com.ebata_shota.disample.di.Component

class DiSampleApp : Application() {

    val component = Component()
}