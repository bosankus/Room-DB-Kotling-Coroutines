package `in`.androidplay.room.rx.presentation.view

import `in`.androidplay.room.rx.databinding.LayoutUserListBinding
import `in`.androidplay.room.rx.data.User
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter


/**
 * Created by Androidplay
 * Author: Ankush
 * On: 20/Dec/2020
 * Email: ankush@androidplay.in
 */
class UserAdapter : ListAdapter<User, UserViewHolder>(DiffUtilCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = LayoutUserListBinding.inflate(layoutInflater, parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val userItem = getItem(position)
        holder.bind(userItem)
    }
}