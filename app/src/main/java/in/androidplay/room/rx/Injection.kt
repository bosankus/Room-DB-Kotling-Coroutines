package `in`.androidplay.room.rx

import `in`.androidplay.room.rx.persistance.UserDao
import `in`.androidplay.room.rx.persistance.UserDatabase
import `in`.androidplay.room.rx.view.UserAdapter
import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Androidplay
 * Author: Ankush
 * On: 19/Dec/2020
 * Email: ankush@androidplay.in
 */

@Module
@InstallIn(SingletonComponent::class)
class Injection {

    @Singleton
    @Provides
    fun providesDatabase(@ApplicationContext context: Context): UserDatabase {
        return Room.databaseBuilder(context, UserDatabase::class.java, "user_table")
            .build()
    }

    @Singleton
    @Provides
    fun providesUserDao(database: UserDatabase): UserDao {
        return database.UserDao()
    }

    @Provides
    fun provideUserAdapter() = UserAdapter()
}