package com.ebata_shota.disample.infra.repository

import com.ebata_shota.disample.domain.model.User
import com.ebata_shota.disample.infra.db.MyDatabase

class UserRepository(
    private val database: MyDatabase
) {
    fun getUser(userId: Int): User? {
        return database.select(userId)
    }

    fun saveUser(user: User) {
        database.insertUser(user)
    }

    fun removeUser(userId: Int) {
        database.remove(userId)
    }
}