package com.example.ramazan.lab3.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News(
        val title : String,
        val date : String,
        val content : String,
        val imageUrl : String) : Parcelable