package com.ebata_shota.disample.mock

import com.ebata_shota.disample.domain.model.User

class MockUserRepository {

    var valueGetUser: Int? = null

    fun getUser(userId: Int): User? {
        valueGetUser = userId
        return User(userId, "dummy")
    }

    var valueSaveUser: User? = null
    fun saveUser(user: User) {
        valueSaveUser = user
    }

    var valueRemoveUser: Int? = null
    fun removeUser(userId: Int) {
        valueRemoveUser = userId
    }
}