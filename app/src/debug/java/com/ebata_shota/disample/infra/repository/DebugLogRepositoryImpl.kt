package com.ebata_shota.disample.infra.repository

import android.util.Log
import com.ebata_shota.disample.domain.repository.LogRepository
import javax.inject.Inject

/**
 * Debug用
 */
class DebugLogRepositoryImpl
@Inject
constructor() : LogRepository {
    override fun sendEventLog(message: String) {
        Log.d("MyLog_Event", message)
    }

    override fun sendPageLog(message: String) {
        Log.d("MyLog_Page", message)
    }
}