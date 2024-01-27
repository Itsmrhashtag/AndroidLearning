package com.example.firstdemoapp

import android.annotation.SuppressLint
import android.os.Build
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val webViewVariable=findViewById<WebView>(R.id.webView)
        webViewSetup(webViewVariable)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(webView: WebView){
        webView.webViewClient= WebViewClient()

        webView.apply {
            settings.javaScriptEnabled=true;
            settings.safeBrowsingEnabled=true;
            loadUrl("https://itsmrhashtag.github.io/portfolio_hashtag/")
        }
    }
}