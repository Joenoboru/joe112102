package com.example.user.joe112102;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class DetailActivity extends AppCompatActivity {
    WebView wv;
    //用loadUrl讀取intent中的link資料
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        wv = (WebView) findViewById(R.id.webView);
        Intent it = getIntent();
        String str_url = it.getStringExtra("str_url");
        wv.setWebChromeClient(new WebChromeClient());
        wv.loadUrl(str_url);
    }

}
