package com.sonne.caicai;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * @author sonne
 * @date 2017-04-28
 * @description The activity of music player.
 */
public class MusicPlayerActivity extends Activity {

	public static final String TAG = "MusicPlayerActivity";
	private final String urlpath = "http://118.89.29.170/player/wuming_radio.html";
	private WebView webview;

	@SuppressLint({ "SetJavaScriptEnabled", "NewApi" })
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.music_player_layout);
		webview = (WebView) findViewById(R.id.webView1);
		removeAllCookie();
		webview.clearHistory();
		webview.clearFormData();
		webview.clearCache(true);
		webview.getSettings().setJavaScriptEnabled(true);
		// webview.getSettings().setBlockNetworkImage(true);
		webview.getSettings().setDomStorageEnabled(true);
		webview.getSettings().setAllowFileAccessFromFileURLs(true);
		webview.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
		webview.setWebViewClient(new WebViewClient() {
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return true;
			}
		});
		webview.loadUrl(urlpath);
	}

	@Override
	public void finish() {
		// 当我们对Activity进行finish的时候，webview持有的页面并不会立即释放，如果页面中有在执行js等其他操作，仅仅进行finish是完全不够的。
		webview.loadUrl("about:blank");
		deleteDatabase("WebView.db");
		deleteDatabase("WebViewCache.db");
		webview.clearHistory();
		webview.clearFormData();
		getCacheDir().delete();
		removeAllCookie();
		super.finish();
	}

	private void removeAllCookie() {
		CookieSyncManager cookieSyncManager = CookieSyncManager
				.createInstance(webview.getContext());
		CookieManager cookieManager = CookieManager.getInstance();
		cookieManager.setAcceptCookie(true);
		cookieManager.removeSessionCookie();

		cookieManager.removeAllCookie();
		cookieSyncManager.sync();
		webview.setWebChromeClient(null);
		webview.setWebViewClient(null);
		webview.getSettings().setJavaScriptEnabled(false);
		webview.clearCache(true);

	}
	
	@Override
	protected void onDestroy() {
	    super.onDestroy();
	    removeAllCookie();
	}

}
