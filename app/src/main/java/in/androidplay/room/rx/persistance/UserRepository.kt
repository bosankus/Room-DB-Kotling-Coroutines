package `in`.androidplay.room.rx.persistance

import androidx.lifecycle.LiveData
import javax.inject.Inject

/**
 * Created by Androidplay
 * Author: Ankush
 * On: 19/Dec/2020
 * Email: ankush@androidplay.in
 */
class UserRepository @Inject constructor(private val dao: UserDao) {

    suspend fun insertUser(user: User) {
        dao.insertUser(user)
    }

    fun getAllUsers() = dao.getAllUsers()
}