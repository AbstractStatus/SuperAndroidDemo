package com.nouser666.superdemo.mainview.simplewebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.nouser666.superdemo.R
import com.nouser666.superdemo.base.BaseActivity

class SimpleWebViewActivity : BaseActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_web_view)

        webView = findViewById(R.id.simple_web_view)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.baidu.com")
    }
}