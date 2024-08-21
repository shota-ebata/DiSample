package com.ebata_shota.disample.infra.db

import com.ebata_shota.disample.domain.model.User

/**
 * 簡易的なデータベース
 * (メモリで保持してるだけなのでアプリKillで消える）
 */
class MyDatabase {
    private val map: MutableMap<Int, User> = mutableMapOf()

    fun insertUser(user: User) {
        map[user.id] = user
    }

    fun select(userId: Int): User? {
        return map[userId]
    }

    fun remove(userId: Int) {
        map.remove(userId)
    }
}