package com.example.pokemonapp

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var webview:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setView()
        loadWebView()
    }

    private fun setView(){
        webview = findViewById(R.id.webview)
    }
    private fun loadWebView(){
        //webview.loadUrl("http://10.0.2.2:3000")
        webview.settings.javaScriptEnabled = true
        webview.settings.mediaPlaybackRequiresUserGesture = true
        webview.setWebChromeClient(WebChromeClient())
        webview.addJavascriptInterface(WebEventsClick(this),"Android")
        webview.loadUrl("http://myapplicationreact.s3-website-us-east-1.amazonaws.com/")
    }

}