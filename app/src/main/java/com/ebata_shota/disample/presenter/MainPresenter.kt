package com.ebata_shota.disample.presenter

import com.ebata_shota.disample.domain.model.User
import com.ebata_shota.disample.domain.repository.LogRepository
import com.ebata_shota.disample.domain.repository.UserRepository
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class MainPresenter
@Inject
constructor(
    val userRepository: UserRepository,
    val logRepository: LogRepository
) {

    fun getUser(): User? {
        logRepository.sendEventLog("getUser")
        return userRepository.getUser(0)
    }

    fun saveUserName(name: String) {
        logRepository.sendEventLog("saveUserName")
        val user = User(
            id = 0,
            name = name
        )
        userRepository.saveUser(user)
    }

    fun removeUser() {
        logRepository.sendEventLog("removeUser")
        userRepository.removeUser(0)
    }

    fun sendPageLog() {
        logRepository.sendPageLog("Main")
    }

}