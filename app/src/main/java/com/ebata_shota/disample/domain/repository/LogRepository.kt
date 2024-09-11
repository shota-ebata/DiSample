package com.ebata_shota.disample.domain.repository

interface LogRepository {
    fun sendEventLog(message: String)

    fun sendPageLog(message: String)
}