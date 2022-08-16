package com.example.pokemonapp.webview

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

class WebEventsClick(val context: Context) {

    @JavascriptInterface
    fun messageClick(message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}