package com.app.wesafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class NearmeActivity extends AppCompatActivity {
    private WebView webview_nearme = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearme);
        this.webview_nearme = (WebView) findViewById(R.id.webview_nearme);

        WebSettings webSettings = webview_nearme.getSettings();
        webSettings.setJavaScriptEnabled(true);

       /* WebViewClientImpl webViewClient = new WebViewClientImpl(this);
        webView_shop.setWebViewClient(webViewClient);*/


        webview_nearme.loadUrl("https://www.google.com/maps/");
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.webview_nearme.canGoBack()) {
            this.webview_nearme.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }


}


