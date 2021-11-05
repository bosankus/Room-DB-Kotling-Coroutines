package `in`.androidplay.room.rx.common

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

/**
 * Created by Androidplay
 * Author: Ankush
 * On: 7/30/2020, 10:54 PM
 */

/*fun logMessage(message: String) {
    Log.d("AndroidPlay", message)
}*/

fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

fun Activity.hideKeyboard() {
    val inputMethodManager: InputMethodManager =
        this.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    var view: View? = this.currentFocus
    if (view == null) view = View(this)
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}
