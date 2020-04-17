package com.app.wesafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MakemaskActivity extends AppCompatActivity {
    private WebView webView_mask = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makemask);
        this.webView_mask = (WebView) findViewById(R.id.webview_mask);

        WebSettings webSettings = webView_mask.getSettings();
        webSettings.setJavaScriptEnabled(true);

       /* WebViewClientImpl webViewClient = new WebViewClientImpl(this);
        webView_shop.setWebViewClient(webViewClient);*/


        webView_mask.loadUrl("https://www.cdc.gov/coronavirus/2019-ncov/prevent-getting-sick/diy-cloth-face-coverings.html");
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.webView_mask.canGoBack()) {
            this.webView_mask.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }


}

