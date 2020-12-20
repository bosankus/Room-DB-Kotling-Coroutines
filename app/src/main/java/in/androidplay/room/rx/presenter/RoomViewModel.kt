package `in`.androidplay.room.rx.presenter

import `in`.androidplay.room.rx.persistance.User
import `in`.androidplay.room.rx.persistance.UserRepository
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

/**
 * Created by Androidplay
 * Author: Ankush
 * On: 19/Dec/2020
 * Email: ankush@androidplay.in
 */
class RoomViewModel @ViewModelInject constructor(private val dataSource: UserRepository) :
    ViewModel() {

    val allUsers = dataSource.getAllUsers()

    fun insertUser(user: User) {
        viewModelScope.launch {
            dataSource.insertUser(user)
        }
    }
}
