package com.maksym.galushka.mytestingproject

import android.content.Context
import android.os.Build
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

private const val APP_NAME = "MyTestingProject"
@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.O])
class TestMeContextTest {

    private lateinit var testObject: TestMeContext

    @Before
    fun prepare() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        testObject = TestMeContext(context)
        println("before runs")
    }

    @Test
    fun getAppName_RealName_Pass() {
        val result = testObject.getAppName()
        assertThat(result).isEqualTo(APP_NAME)
    }

    @Test
    fun getAppName_Fail() {
        val result = testObject.getAppName()
        assertThat(result).isNotEqualTo("fake name")
    }
}