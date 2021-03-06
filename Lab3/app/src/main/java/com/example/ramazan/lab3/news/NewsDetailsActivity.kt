package com.example.ramazan.lab3.news

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.ramazan.lab3.entities.News
import com.example.ramazan.lab3.R
import com.example.ramazan.lab3.entities.News
import com.example.ramazan.lab3.R
import kotlinx.android.synthetic.main.activity_news_details.*

class NewsDetailsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        setSupportActionBar(main_toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)


        val news : News = intent.getParcelableExtra("news")

        tvTitle.text = news.title

        tvDate.text = news.date

        tvContent.text = news.content

        if (news.imageUrl != "")
            Glide.with(this).load(news.imageUrl).into(main_backdrop)
    }

}
