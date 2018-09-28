package com.example.ramazan.lab3

import android.app.Application
import com.example.ramazan.lab3.news.newsApp
import com.example.ramazan.lab3.news.newsApp
import org.koin.android.ext.android.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(newsApp))
    }
}