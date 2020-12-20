package `in`.androidplay.room.rx.persistance

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by Androidplay
 * Author: Ankush
 * On: 19/Dec/2020
 * Email: ankush@androidplay.in
 */

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class UserDatabase : RoomDatabase() {

    abstract fun UserDao(): UserDao
}