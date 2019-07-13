package com.example.jjwtkissue

import android.app.Application
import android.support.multidex.MultiDex
import android.content.Context

class App(): Application() {
    override fun onCreate() {
        super.onCreate()
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
