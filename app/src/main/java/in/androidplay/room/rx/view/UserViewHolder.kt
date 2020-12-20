package `in`.androidplay.room.rx.view

import `in`.androidplay.room.rx.databinding.LayoutUserListBinding
import `in`.androidplay.room.rx.persistance.User
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Androidplay
 * Author: Ankush
 * On: 20/Dec/2020
 * Email: ankush@androidplay.in
 */
class UserViewHolder(private val binding: LayoutUserListBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(userItem: User) {
        binding.user = userItem
        binding.executePendingBindings()
    }
}