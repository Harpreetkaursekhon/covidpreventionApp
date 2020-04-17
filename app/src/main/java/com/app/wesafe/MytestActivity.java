package com.app.wesafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MytestActivity extends AppCompatActivity {
    private WebView webView_test = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mytest);

        this.webView_test = (WebView) findViewById(R.id.webview_test);

        WebSettings webSettings = webView_test.getSettings();
        webSettings.setJavaScriptEnabled(true);

       /* WebViewClientImpl webViewClient = new WebViewClientImpl(this);
        webView_shop.setWebViewClient(webViewClient);*/


        webView_test.loadUrl("https://www.dhhs.vic.gov.au/coronavirus-self-assessment");
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.webView_test.canGoBack()) {
            this.webView_test.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }


}

