package com.example.ramazan.lab3.news

import com.example.ramazan.lab3.core.BaseListener
import com.example.ramazan.lab3.core.BasePresenter
import com.example.ramazan.lab3.entities.News
import com.example.ramazan.lab3.news.NewsListContract

class NewsListPresenter(private val repository: NewsListContract.Repository)
    : BasePresenter<NewsListContract.View>(),
        NewsListContract.Presenter,
        BaseListener.onReadFinishedListener {

    override fun viewIsReady() { }

    override fun getNews() {
        repository.getNews(this)
    }

    override fun onReadFinished(items: ArrayList<News>) {
        getView()?.setAdapter(items)
    }

    override fun destroy() {
        detachView()
    }

}