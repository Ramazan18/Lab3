package com.example.ramazan.lab3.core

import com.example.ramazan.lab3.entities.News

interface BaseListener {

    interface onReadFinishedListener {
        fun onReadFinished(items : ArrayList<News>)
    }

}