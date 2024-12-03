package com.ebata_shota.disample.mock

import com.ebata_shota.disample.domain.repository.LogRepository

class MockLogRepository(): LogRepository {
    override fun sendEventLog(message: String) {

    }

    override fun sendPageLog(message: String) {

    }
}