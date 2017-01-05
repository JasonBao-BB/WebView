package com.example.administrator.webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;

public class MainActivity extends Activity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("http://www.google.com");
    }
}
