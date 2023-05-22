package com.halaman.com.utils

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.halaman.com.activities.MainActivity
import java.io.IOException

fun Context.getCountryCode(): List<MainActivity.BookModel> {
    lateinit var jsonString: String
    try {
        jsonString = this
            .assets
            .open("person_data.json")
            .bufferedReader()
            .use { it.readText() }
    } catch (e: IOException) {
        e.printStackTrace()
    }

    val listCountryType = object : TypeToken<List<MainActivity.BookModel>>() {}.type
    return Gson().fromJson(jsonString, listCountryType)
}