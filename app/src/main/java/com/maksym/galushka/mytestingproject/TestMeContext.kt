package com.maksym.galushka.mytestingproject

import android.content.Context

/**
 * Created by Maksym in Feb 2020.
 * Copyright @TAC Company 2019.
 */
class TestMeContext (private val context: Context) {

    fun getAppName(): String {
        return context.getString(R.string.app_name)
    }
}