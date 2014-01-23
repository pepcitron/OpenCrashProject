package com.open.opencrash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.open.controllers.JavaScriptManager;

/**
 * Main activity class
 * @see "http://blog.objectgraph.com/index.php/2012/03/16/android-development-javascript-bridge-example-fully-explained/"
 */
public class MainActivity extends Activity {

    WebView mainWebView;

    /**
     * onCreate global
     * @param savedInstanceState saved instance state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainWebView = (WebView)findViewById(R.id.webView);
        final String DEFAULT_URL = "file:///android_asset/index.html";

        //Activation du Javascript
        WebSettings webSettings = mainWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Ajout du contrôleur
        mainWebView.addJavascriptInterface(new JavaScriptManager(this), "JavaScriptManager");

        //Chargement du HTML
        mainWebView.loadUrl(DEFAULT_URL);
    }

    /**
     * Call the javascript given in parameter
     * @param pJavascript javascript string
     */
    public void callJavascript(final String pJavascript){
        // I need to run set operation of UI on the main thread.
        // therefore, the above parameter "val" must be final
        runOnUiThread(new Runnable() {
            public void run() {
                mainWebView.loadUrl("javascript:"+pJavascript);
            }
        });
    }

}
