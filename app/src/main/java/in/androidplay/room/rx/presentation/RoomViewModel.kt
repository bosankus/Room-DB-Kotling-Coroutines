package `in`.androidplay.room.rx.presentation

import `in`.androidplay.room.rx.data.User
import `in`.androidplay.room.rx.data.UserRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Androidplay
 * Author: Ankush
 * On: 19/Dec/2020
 * Email: ankush@androidplay.in
 */
@HiltViewModel
class RoomViewModel @Inject constructor(private val dataSource: UserRepository) :
    ViewModel() {

    val allUsers = dataSource.getAllUsers()

    fun insertUser(user: User) {
        viewModelScope.launch {
            dataSource.insertUser(user)
        }
    }
}
