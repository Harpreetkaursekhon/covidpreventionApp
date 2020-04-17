package com.app.wesafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class CoronaLive extends AppCompatActivity {
    private WebView webView_live = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_live);

        this.webView_live = (WebView) findViewById(R.id.webview_live);

        WebSettings webSettings = webView_live.getSettings();
        webSettings.setJavaScriptEnabled(true);

       /* WebViewClientImpl webViewClient = new WebViewClientImpl(this);
        webView_shop.setWebViewClient(webViewClient);*/


        webView_live.loadUrl("https://www.covidvisualizer.com/");
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.webView_live.canGoBack()) {
            this.webView_live.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }


    }

