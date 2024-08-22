package com.ebata_shota.disample.infra.repository

import com.ebata_shota.disample.domain.model.User
import com.ebata_shota.disample.infra.db.MyDatabase

interface UserRepository {
    fun getUser(userId: Int): User?

    fun saveUser(user: User)

    fun removeUser(userId: Int)
}

class UserRepositoryImpl(
    private val database: MyDatabase
) : UserRepository {
    override fun getUser(userId: Int): User? {
        return database.select(userId)
    }

    override fun saveUser(user: User) {
        database.insertUser(user)
    }

    override fun removeUser(userId: Int) {
        database.remove(userId)
    }
}