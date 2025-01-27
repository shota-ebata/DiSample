package com.ebata_shota.disample.infra.repository

import com.ebata_shota.disample.domain.repository.LogRepository
import javax.inject.Inject

/**
 * Release用
 */
class ReleaseLogRepositoryImpl
@Inject
constructor() : LogRepository {
    override fun sendEventLog(message: String) {
        // リリース版ではログを送らない
    }

    override fun sendPageLog(message: String) {
        // リリース版ではログを送らない
    }
}