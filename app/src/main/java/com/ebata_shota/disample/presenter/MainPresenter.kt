package com.ebata_shota.disample.presenter

import com.ebata_shota.disample.domain.model.User
import com.ebata_shota.disample.infra.repository.UserRepository

class MainPresenter(
    val userRepository: UserRepository
) {

    fun getUser(): User? {
        return userRepository.getUser(0)
    }

    fun saveUserName(name: String) {
        val user = User(
            id = 0,
            name = name
        )
        userRepository.saveUser(user)
    }

    fun removeUser() {
        userRepository.removeUser(0)
    }

}