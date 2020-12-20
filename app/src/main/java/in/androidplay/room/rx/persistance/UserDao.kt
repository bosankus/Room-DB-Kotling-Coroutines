package `in`.androidplay.room.rx.persistance

import androidx.lifecycle.LiveData
import androidx.room.*

/**
 * Created by Androidplay
 * Author: Ankush
 * On: 19/Dec/2020
 * Email: ankush@androidplay.in
 */

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM user_table")
    fun getAllUsers(): LiveData<List<User>>
}