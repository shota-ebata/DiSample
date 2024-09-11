package com.ebata_shota.disample.domain.repository

import com.ebata_shota.disample.domain.model.User

interface UserRepository {
    fun getUser(userId: Int): User?

    fun saveUser(user: User)

    fun removeUser(userId: Int)
}