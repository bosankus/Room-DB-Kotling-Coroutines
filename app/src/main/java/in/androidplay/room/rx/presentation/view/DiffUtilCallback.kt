package `in`.androidplay.room.rx.presentation.view

import `in`.androidplay.room.rx.data.User
import androidx.recyclerview.widget.DiffUtil

/**
 * Created by Androidplay
 * Author: Ankush
 * On: 20/Dec/2020
 * Email: ankush@androidplay.in
 */
class DiffUtilCallback : DiffUtil.ItemCallback<User>() {
    override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
        return oldItem.hashCode() == newItem.hashCode()
    }
}