package com.whitturner.svgtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;

//This is a generic web activity with URL passed in from the intent call

//Todo: add progress bar
//Todo: fix W/cr_BindingManager: Cannot call determinedVisibility() - never saw a connection for the pid: 15680
//Todo: add home button to action bar

public class WebActivity5 extends AppCompatActivity {

    private WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web5);
//        getActionBar().setHomeButtonEnabled(true);
        String url = super.getIntent().getExtras().getString("urlString");
        loadUrlInWebView(url);
    }

// This enables the back button to go back one step in web history

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
            return;
        }
        // Otherwise go back to home screen and clear cache.
        super.onBackPressed();
        webView.clearCache(true);
    }


    private void loadUrlInWebView(String url) {
        webView = findViewById(R.id.webView5);
        webView.setWebViewClient(new WebViewClient());
        WebSettings settings = webView.getSettings();
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setVerticalScrollBarEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        //The following will delete all old data previously used by webView prior to loading page
        android.webkit.WebStorage.getInstance().deleteAllData();
        webView.loadUrl(url);
    }

    //Clean up cache on abnormal exit

    @Override
    protected void onStop(){
        super.onStop();
        webView.clearCache(true);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        webView.clearCache(true);
    }

}
