package com.example.stopwatch

import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUiTestWithAndroidComposeRule {

    @Rule
    @JvmField
    var composeTestRule: ComposeContentTestRule = createAndroidComposeRule<UiTestingDemoActivity>()

    @Test
    fun whenIClickOnButton_TheTextShouldChange() {
        composeTestRule.onNodeWithText("Hello").assertExists()
        composeTestRule.onNodeWithText("Hello").performClick()
        composeTestRule.onNodeWithText("Hello").assertDoesNotExist()
        composeTestRule.onNodeWithText("Bye").assertExists()
    }

}
