package com.ebata_shota.disample.mock

import com.ebata_shota.disample.domain.model.User
import com.ebata_shota.disample.infra.repository.UserRepository

class MockUserRepository : UserRepository {

    var valueGetUser: Int? = null
    override fun getUser(userId: Int): User? {
        valueGetUser = userId
        return User(userId, "dummy")
    }

    var valueSaveUser: User? = null
    override fun saveUser(user: User) {
        valueSaveUser = user
    }

    var valueRemoveUser: Int? = null
    override fun removeUser(userId: Int) {
        valueRemoveUser = userId
    }
}