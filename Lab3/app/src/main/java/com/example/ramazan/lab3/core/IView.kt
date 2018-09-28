package com.example.ramazan.lab3.core


interface IView <out P : IPresenter<*>> {
    val presenter : P
}