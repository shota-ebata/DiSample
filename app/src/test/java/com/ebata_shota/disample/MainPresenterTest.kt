package com.ebata_shota.disample

import com.ebata_shota.disample.domain.model.User
import com.ebata_shota.disample.presenter.MainPresenter
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MainPresenterTest {

    private lateinit var presenter: MainPresenter

    @Before
    fun setup() {
        presenter = MainPresenter()
    }

    @Test
    fun saveUserName_test() {
        val name = "hoge"

        // execute
        presenter.saveUserName(name)

        // assert
        val actual = User(0, name)
        val user = presenter.getUser()
        assertEquals(user, actual)
    }

    @Test
    fun removeUser() {
        val name = "hoge"
        presenter.saveUserName(name)

        // execute
        presenter.removeUser()

        // assert
        val actual: User? = null
        val user = presenter.getUser()
        assertEquals(user, actual)
    }
}