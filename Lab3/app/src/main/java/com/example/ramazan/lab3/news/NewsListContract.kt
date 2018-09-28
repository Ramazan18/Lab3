package com.example.ramazan.lab3.news

import com.example.ramazan.lab3.core.BaseListener
import com.example.ramazan.lab3.core.IPresenter
import com.example.ramazan.lab3.core.IView
import com.example.ramazan.lab3.entities.News

interface NewsListContract {

    interface View : IView<Presenter> {
        fun setAdapter (items : ArrayList<News>)
        fun showMessage (message : String)
    }

    interface Presenter : IPresenter<View> {
        fun getNews ()
    }

    interface Repository {
        fun getNews (listener : BaseListener.onReadFinishedListener)
    }

}