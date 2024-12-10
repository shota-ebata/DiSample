package com.ebata_shota.disample

import com.ebata_shota.disample.domain.model.User
import com.ebata_shota.disample.mock.MockLogRepository
import com.ebata_shota.disample.mock.MockUserRepository
import com.ebata_shota.disample.presenter.MainPresenter
import org.junit.Assert.assertEquals
import org.junit.Test

class MainPresenterTest {

    private val mockUserRepository = MockUserRepository()
    private val mockLogRepository = MockLogRepository()
    private val presenter = MainPresenter(
        userRepository = mockUserRepository,
        logRepository = mockLogRepository
    )

    @Test
    fun getUser_test() {
        // execute
        presenter.getUser()

        // assert userRepository.getUser() が引数「0」で呼び出されたことを確認
        assertEquals(mockUserRepository.valueGetUser, 0)
    }

    @Test
    fun saveUserName_test() {
        val name = "hoge"

        // execute
        presenter.saveUserName(name)

        // assert userRepository.saveUser() が引数「User(0, "hoge")」で呼び出されたことを確認
        val actual = User(0, name)
        assertEquals(mockUserRepository.valueSaveUser, actual)
    }

    @Test
    fun removeUser() {
        // execute
        presenter.removeUser()

        // assert userRepository.removeUser() が引数「0」で呼び出されたことを確認
        assertEquals(mockUserRepository.valueRemoveUser, 0)
    }
}