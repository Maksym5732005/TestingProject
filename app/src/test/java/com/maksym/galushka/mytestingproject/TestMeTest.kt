package com.maksym.galushka.mytestingproject

import com.google.common.truth.Truth.assertThat
import org.junit.Test

/**
 * Created by Maksym in Feb 2020.
 * Copyright @TAC Company 2019.
 */
class TestMeTest {

    private val testMe by lazy (LazyThreadSafetyMode.NONE) {
        TestMe()
    }

    @Test
    fun isEmailValid_UserMail_Valid() {
        assertThat(testMe.isEmailValid("df")).isTrue()
    }

    @Test
    fun isEmailValid_EmptyMain_Valid() {
        assertThat(testMe.isEmailValid("")).isFalse()
    }
}