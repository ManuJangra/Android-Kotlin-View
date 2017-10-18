package com.android.demo

import android.app.Application

/**
 * Created by manoj[dot]kumar[at]geminisolutions[dot]in on 10/18/17.
 */

class App : Application() {
    companion object {
        lateinit var mInstance: App
    }

    override fun onCreate() {
        super.onCreate()
        mInstance = this
    }
}