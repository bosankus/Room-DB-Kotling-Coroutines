package `in`.androidplay.room.rx.presentation.view

import `in`.androidplay.room.rx.R
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    private lateinit var activityScenario: ActivityScenario<MainActivity>

    @Before
    fun setup() {
        activityScenario = ActivityScenario.launch(MainActivity::class.java)
        activityScenario.moveToState(Lifecycle.State.RESUMED)
    }

    @Test
    fun addUser() {
        val userName = "Espresso test user"
        val description = "Espresso test user description"
        onView(withId(R.id.tvUsernameInput)).perform(typeText(userName))
        onView(withId(R.id.tvDepartmentInput)).perform(typeText(description))
        Espresso.closeSoftKeyboard()
        onView(withId(R.id.btnSaveUser)).perform(click())

        // Assertion
        onView(withText(userName)).check(matches(isDisplayed()))
        onView(withText(description)).check(matches(isDisplayed()))
    }

}