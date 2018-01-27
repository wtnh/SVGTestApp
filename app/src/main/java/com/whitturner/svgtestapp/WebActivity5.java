package com.whitturner.svgtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.widget.ProgressBar;
import android.widget.Toast;

//This is an attempt to build a generic web activity with URL passed in from the intent call

public class WebActivity5 extends AppCompatActivity {

    private WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web5);
//        WebSettings settings = webView.getSettings();
//        settings.setJavaScriptEnabled(true);
//        setContentView(R.layout.asset_web_view);
        String url = super.getIntent().getExtras().getString("urlString");
        loadUrlInWebView(url);


//        webView.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_OVERLAY);
//        webView.getSettings().setBuiltInZoomControls(true);
//        webView.getSettings().setUseWideViewPort(true);
//        webView.getSettings().setLoadWithOverviewMode(true);
//       final ProgressBar progressBar;

//       progressBar = new ProgressBar(WebActivity5.this);
//        progressBar.setMessage("Loading...");
//       progressBar.setVisibility(View.VISIBLE);
    }


// This enables the back button to go back one step in web history
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
            return;
        }
        // Otherwise defer to system default behavior.
        super.onBackPressed();
    }

    private void loadUrlInWebView(String url){
        webView = findViewById(R.id.webView5);
        webView.setWebViewClient(new WebViewClient());
        WebSettings settings = webView.getSettings();
        webView.getSettings().setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);

// Need to fix progress bar code - progress bar will appear by default due to xml
//        final ProgressBar progressBar;
//        progressBar = new ProgressBar(WebActivity5.this);
//        progressBar.setMessage("Loading...");
//        progressBar.setVisibility(View.VISIBLE);
//        public void onPageFinished(WebView view,String url){

        webView.loadUrl(url);


    }

}