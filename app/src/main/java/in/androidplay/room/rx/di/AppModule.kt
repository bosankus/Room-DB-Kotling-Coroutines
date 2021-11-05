package `in`.androidplay.room.rx.di

import `in`.androidplay.room.rx.data.UserDao
import `in`.androidplay.room.rx.data.UserDatabase
import `in`.androidplay.room.rx.presentation.view.UserAdapter
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
object AppModule {

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