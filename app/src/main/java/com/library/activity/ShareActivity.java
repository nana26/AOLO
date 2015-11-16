package com.library.activity;

import android.app.Activity;
import android.location.LocationManager;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by joseph on 15/11/15.
 */
public class ShareActivity extends Activity{

    private WebView webView;
    private LocationManager lmgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        lmgr=(LocationManager)getSystemService(LOCATION_SERVICE);

        webView=(WebView)findViewById(R.id.webView);
        initWebView();

    }
    private void initWebView(){

        MyWebClient client =new MyWebClient();
        webView.setWebViewClient(client);

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);


        webView.loadUrl("file:///android_asset/MyMap.html");

    }
    private class MyWebClient extends WebViewClient{

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
