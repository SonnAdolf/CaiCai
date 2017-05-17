package com.sonne.caicai;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * @author sonne
 * @date 2017-05-15
 * @description The activity of movie player.
 */
public class MoviePlayerActivity extends Activity {

	public static final String TAG = "MoviePlayerActivity";
	// private WebView webview;
	//
	// @SuppressLint({ "SetJavaScriptEnabled", "NewApi" }) @Override
	// protected void onCreate(Bundle savedInstanceState) {
	// super.onCreate(savedInstanceState);
	// Log.d(TAG, "onCreate");
	// requestWindowFeature(Window.FEATURE_NO_TITLE);
	// setContentView(R.layout.movie_player_layout);
	// webview = (WebView)findViewById(R.id.webView1);
	// WebSettings ws = webview.getSettings();
	//
	//
	//
	// /**
	// *
	// * setAllowFileAccess 启用或禁止WebView访问文件数据 setBlockNetworkImage 是否显示网络图像
	// * setBuiltInZoomControls 设置是否支持缩放 setCacheMode 设置缓冲的模式
	// * setDefaultFontSize 设置默认的字体大小 setDefaultTextEncodingName 设置在解码时使用的默认编码
	// * setFixedFontFamily 设置固定使用的字体 setJavaSciptEnabled 设置是否支持Javascript
	// * setLayoutAlgorithm 设置布局方式 setLightTouchEnabled 设置用鼠标激活被选项
	// * setSupportZoom 设置是否支持变焦
	// * */
	// //ws.setBuiltInZoomControls(true);// 隐藏缩放按钮
	// ws.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);//
	// 排版适应屏幕
	// ws.setUseWideViewPort(true);// 可任意比例缩放
	// ws.setLoadWithOverviewMode(true);//
	// setUseWideViewPort方法设置webview推荐使用的窗口。setLoadWithOverviewMode方法是设置webview加载的页面的模式。
	// //ws.setSavePassword(true);
	// //ws.setSaveFormData(true);// 保存表单数据
	// ws.setJavaScriptEnabled(true);
	// //ws.setGeolocationEnabled(true);// 启用地理定位
	// //ws.setGeolocationDatabasePath("/data/data/org.itri.html5webview/databases/");//
	// 设置定位的数据库路径
	// ws.setDomStorageEnabled(true);
	// ws.setAllowFileAccessFromFileURLs(true);
	// ws.setAllowFileAccess(true); // 允许访问文件
	// ws.setSupportZoom(true);
	// WebChromeClient mWebchromeclient = new mWebChromeClient();
	// webview.setWebChromeClient(mWebchromeclient);
	// webview.setWebViewClient(new WebViewClient() {
	// public boolean shouldOverrideUrlLoading(WebView view, String url) {
	// view.loadUrl(url);
	// return true;
	// }
	// });
	// webview.loadUrl("http://118.89.29.170/movie/h5.html");
	// }

	// private FrameLayout mFrameLayout;
	// private WebView mWebView;
	// private InsideWebChromeClient mInsideWebChromeClient;
	// //private JavascriptInterface javascriptInterface;
	// private String URL = "http://118.89.29.170/movie/h5.html";
	//
	// @Override
	// protected void onCreate(Bundle saveInstanceState) {
	// super.onCreate(saveInstanceState);
	// // 1
	// requestWindowFeature(Window.FEATURE_NO_TITLE);
	// setContentView(R.layout.movie_player_layout);
	// // 2
	// mFrameLayout = (FrameLayout) findViewById(R.id.mFrameLayout);
	// mWebView = (WebView) findViewById(R.id.mWebView);
	// // 3
	// initWebView();
	// mWebView.loadUrl(URL);
	// }
	//
	// @Override
	// public void onPause() {
	// super.onPause();
	// mWebView.onPause();
	// }
	//
	// @Override
	// public void onResume() {
	// super.onResume();
	// mWebView.onResume();
	// }
	//
	// @Override
	// public void onBackPressed() {
	// if (mWebView.canGoBack()) {
	// mWebView.goBack();
	// return;
	// }
	// super.onBackPressed();
	// }
	//
	// @Override
	// public void onDestroy() {
	// mWebView.destroy();
	// super.onDestroy();
	// }
	//
	// @Override
	// public void onConfigurationChanged(Configuration config) {
	// super.onConfigurationChanged(config);
	// switch (config.orientation) {
	// case Configuration.ORIENTATION_LANDSCAPE:
	// getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
	// getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	// break;
	// case Configuration.ORIENTATION_PORTRAIT:
	// getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	// getWindow().addFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
	// break;
	// }
	// }
	// private void initWebView() {
	// WebSettings settings = mWebView.getSettings();
	// settings.setJavaScriptEnabled(true);
	// settings.setJavaScriptCanOpenWindowsAutomatically(true);
	// settings.setPluginState(WebSettings.PluginState.ON);
	// //settings.setPluginsEnabled(true);
	// settings.setAllowFileAccess(true);
	// settings.setLoadWithOverviewMode(true);
	// settings.setUseWideViewPort(true);
	// settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
	// settings.setCacheMode(WebSettings.LOAD_DEFAULT);
	// mInsideWebChromeClient = new InsideWebChromeClient();
	// InsideWebViewClient mInsideWebViewClient = new InsideWebViewClient();
	// //javascriptInterface = new JavascriptInterface();
	// //mWebView.addJavascriptInterface(javascriptInterface,
	// "java2js_laole918");
	// mWebView.setWebChromeClient(mInsideWebChromeClient);
	// mWebView.setWebViewClient(mInsideWebViewClient);
	// }
	//
	//
	// private class InsideWebChromeClient extends WebChromeClient {
	// private View mCustomView;
	// private CustomViewCallback mCustomViewCallback;
	//
	// @Override
	// public void onShowCustomView(View view, CustomViewCallback callback) {
	// super.onShowCustomView(view, callback);
	// if (mCustomView != null) {
	// callback.onCustomViewHidden();
	// return;
	// }
	// mCustomView = view;
	// mFrameLayout.addView(mCustomView);
	// mCustomViewCallback = callback;
	// mWebView.setVisibility(View.GONE);
	// setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	// }
	//
	// public void onHideCustomView() {
	// mWebView.setVisibility(View.VISIBLE);
	// if (mCustomView == null) {
	// return;
	// }
	// mCustomView.setVisibility(View.GONE);
	// mFrameLayout.removeView(mCustomView);
	// mCustomViewCallback.onCustomViewHidden();
	// mCustomView = null;
	// setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	// super.onHideCustomView();
	// }
	// }
	//
	// private class InsideWebViewClient extends WebViewClient {
	//
	// @Override
	// public boolean shouldOverrideUrlLoading(WebView view, String url) {
	// // TODO Auto-generated method stub
	// view.loadUrl(url);
	// return true;
	// }
	//
	// @Override
	// public void onPageFinished(WebView view, String url) {
	// super.onPageFinished(view, url);
	// //mWebView.loadUrl(javascript);
	// }
	//
	// }

	private VideoView videoView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.movie_player_layout);

		// 本地的视频 需要在手机SD卡根目录添加一个 fl1234.mp4 视频
		// String videoUrl1 =
		// Environment.getExternalStorageDirectory().getPath()+"/fl1234.mp4" ;

		// 网络视频
		String videoUrl2 = "http://118.89.29.170/movie/movie.mp4";

		Uri uri = Uri.parse(videoUrl2);

		videoView = (VideoView) this.findViewById(R.id.videoView);

		// 设置视频控制器
		videoView.setMediaController(new MediaController(this));

		// 播放完成回调
		videoView.setOnCompletionListener(new MyPlayerOnCompletionListener());

		// 设置视频路径
		videoView.setVideoURI(uri);
		RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
				RelativeLayout.LayoutParams.FILL_PARENT,
				RelativeLayout.LayoutParams.FILL_PARENT);
		layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
		layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
		layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		videoView.setLayoutParams(layoutParams);

		// 开始播放视频
		videoView.start();
	}

	class MyPlayerOnCompletionListener implements
			MediaPlayer.OnCompletionListener {

		@Override
		public void onCompletion(MediaPlayer mp) {
			Toast.makeText(MoviePlayerActivity.this, "播放完成了",
					Toast.LENGTH_SHORT).show();
		}
	}

}
