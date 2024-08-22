package com.ebata_shota.disample.presenter

import com.ebata_shota.disample.domain.model.User
import com.ebata_shota.disample.infra.repository.UserRepository
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class MainPresenter
@Inject
constructor(
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