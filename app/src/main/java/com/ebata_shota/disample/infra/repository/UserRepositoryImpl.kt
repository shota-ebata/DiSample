package com.ebata_shota.disample.infra.repository

import com.ebata_shota.disample.domain.model.User
import com.ebata_shota.disample.domain.repository.UserRepository
import com.ebata_shota.disample.infra.db.MyDatabase
import javax.inject.Inject



class UserRepositoryImpl
@Inject
constructor(
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