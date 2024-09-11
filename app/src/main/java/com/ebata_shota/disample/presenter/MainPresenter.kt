package com.ebata_shota.disample.presenter

import com.ebata_shota.disample.domain.model.User

class MainPresenter {

    private var user: User? = null

    fun getUser(): User? {
        return user
    }

    fun saveUserName(name: String) {
        user = User(
            id = 0,
            name = name
        )
    }

    fun removeUser() {
        user = null
    }

}