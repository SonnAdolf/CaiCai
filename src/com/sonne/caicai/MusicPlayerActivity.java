package com.sonne.caicai;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * @author sonne
 * @date   2017-04-28
 * @description The activity of music player.
 */
public class MusicPlayerActivity extends Activity {
	
	public static final String TAG = "MusicPlayerActivity";
	private WebView webview; 
	
    @SuppressLint({ "SetJavaScriptEnabled", "NewApi" }) @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.music_player_layout); 
        webview = (WebView)findViewById(R.id.webView1);
        webview.getSettings().setJavaScriptEnabled(true);
        //webview.getSettings().setBlockNetworkImage(true); 
        webview.getSettings().setDomStorageEnabled(true);
        webview.getSettings().setAllowFileAccessFromFileURLs(true);
        webview.setWebViewClient(new WebViewClient() {
        	public boolean shouldOverrideUrlLoading(WebView view, String url) {
        		view.loadUrl(url);
        		return true;
        	}
        });
        webview.loadUrl("http://118.89.29.170/player/wuming_radio.html");
    }
}
