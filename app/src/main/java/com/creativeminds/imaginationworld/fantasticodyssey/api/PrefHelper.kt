package com.creativeminds.imaginationworld.fantasticodyssey.api

import android.content.Context
import androidx.core.content.edit

class PrefHelper(private val context: Context) {

    fun saveUserAgree(agree: Boolean) {
        val sharedPreferences =
            context.getSharedPreferences("MyAppPrefs", Context.MODE_PRIVATE)
        sharedPreferences.edit { putBoolean("agree", agree) }
    }

    fun getSavedUserAgree(): Boolean {
        val sharedPreferences =
            context.getSharedPreferences("MyAppPrefs", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("agree", false)
    }

    fun saveLastDateModified(date: String) {
        val sharedPreferences =
            context.getSharedPreferences("MyAppPrefs", Context.MODE_PRIVATE)
        sharedPreferences.edit { putString("last-modified", date) }
    }

    fun getLastModifiedDate(): String? {
        val sharedPreferences =
            context.getSharedPreferences("MyAppPrefs", Context.MODE_PRIVATE)
        return sharedPreferences.getString("last-modified", null)
    }
}