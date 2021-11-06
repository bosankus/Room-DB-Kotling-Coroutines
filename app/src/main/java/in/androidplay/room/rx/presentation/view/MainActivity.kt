package `in`.androidplay.room.rx.presentation.view

import `in`.androidplay.room.rx.databinding.ActivityMainBinding
import `in`.androidplay.room.rx.common.hideKeyboard
import `in`.androidplay.room.rx.data.User
import `in`.androidplay.room.rx.presentation.RoomViewModel
import `in`.androidplay.room.rx.common.showToast
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var adapter: UserAdapter
    private lateinit var binding: ActivityMainBinding
    private val viewModel: RoomViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setClickListeners()
    }

    private fun setClickListeners() {
        binding.btnSaveUser.setOnClickListener { saveUser() }
        viewModel.allUsers.observe(this, { users ->
            users?.let { adapter.submitList(it) }
        })
    }

    private fun saveUser() {
        hideKeyboard()
        val username = binding.tvUsernameInput.text.toString()
        val department = binding.tvDepartmentInput.text.toString()
        if (username.isNotEmpty() && department.isNotEmpty()) {
            val user = User(username, department)
            viewModel.insertUser(user)
            showToast(this, "User saved.")
        } else showToast(this, "Fields can't be empty")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

    override fun onDestroy() {
        super.onDestroy()
        finishAffinity()
    }
}