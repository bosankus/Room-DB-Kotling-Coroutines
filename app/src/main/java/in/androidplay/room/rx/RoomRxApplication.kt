package `in`.androidplay.room.rx

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by Androidplay
 * Author: Ankush
 * On: 19/Dec/2020
 * Email: ankush@androidplay.in
 */
@HiltAndroidApp
class RoomRxApplication: Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}