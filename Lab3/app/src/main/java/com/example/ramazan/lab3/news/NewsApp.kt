package com.example.ramazan.lab3.news

import com.example.ramazan.lab3.news.NewsListPresenter
import org.koin.dsl.module.module
import java.lang.reflect.Array.get


val newsApp = module {

    factory { NewsListPresenter(get()) as NewsListContract.Presenter}

    single { NewsRepositoryImpl() as NewsListContract.Repository}
}