package `in`.androidplay.room.rx.persistance

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Androidplay
 * Author: Ankush
 * On: 19/Dec/2020
 * Email: ankush@androidplay.in
 */

@Entity(tableName = "user_table")
data class User(
    @ColumnInfo(name = "username") var userName: String? = "",
    @ColumnInfo(name = "dept_name") var department: String? = ""
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
