package com.open.opencrash;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class JavascriptInterfaceActivity extends Activity {
    /** Called when the activity is first created. */


    WebView wv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wv = (WebView)findViewById(R.id.webView);

        wv.getSettings().setJavaScriptEnabled(true);
        // register class containing methods to be exposed to JavaScript

        wv.loadUrl("javascript:alert('test.html');");

    }

}