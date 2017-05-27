package com.sonne.caicai;

import java.util.Random;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * @author sonne
 * @date 2017-04-19
 * @description The activity of main page.
 */
public class MainActivity extends Activity {

	public static final String TAG = "MainActivity";

	/*
	 * sonne
	 * ÀÊª˙…Ë÷√±≥æ∞Õº∆¨
	 * 2017-05-27
	 */
	@SuppressLint("NewApi")
	private void setBackgroundImg() {
		RelativeLayout rl = (RelativeLayout) findViewById(R.id.main_layout);
		Drawable drawable = getResources().getDrawable(
				R.drawable.background_main);
		Drawable drawable2 = getResources().getDrawable(
				R.drawable.background_main2);
		Drawable drawable3 = getResources().getDrawable(
				R.drawable.background_main3);
		Drawable drawable4 = getResources().getDrawable(
				R.drawable.background_main4);
		Drawable drawable5 = getResources().getDrawable(
				R.drawable.background_main5);
		Drawable drawable6 = getResources().getDrawable(
				R.drawable.background_main6);
		Drawable drawable7 = getResources().getDrawable(
				R.drawable.background_main7);
		Drawable drawable8 = getResources().getDrawable(
				R.drawable.background_main8);
		Drawable drawable9 = getResources().getDrawable(
				R.drawable.background_main9);
		
		int s = new Random().nextInt(9) + 1;

		if (s == 1) {
			rl.setBackground(drawable);
		} else if (s == 2){
			rl.setBackground(drawable2);
		} else if (s == 3){
			rl.setBackground(drawable3);
		} else if (s == 4){
			rl.setBackground(drawable4);
		} else if (s == 5){
			rl.setBackground(drawable5);
		} else if (s == 6){
			rl.setBackground(drawable6);
		} else if (s == 7){
			rl.setBackground(drawable7);
		} else if (s == 8){
			rl.setBackground(drawable8);
		} else if (s == 9){
			rl.setBackground(drawable9);
		} 
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		if (savedInstanceState != null) {
			String tempData = savedInstanceState.getString("data_key");
			Log.d(TAG, tempData);
		}
		
		setBackgroundImg();

		TextView tv1 = (TextView) findViewById(R.id.main_words);
		tv1.getPaint().setFakeBoldText(true);
		Typeface mtypeface = Typeface.createFromAsset(getAssets(),
				"huakangshaonv.ttf");
		tv1.setTypeface(mtypeface);

		TextView tv2 = (TextView) findViewById(R.id.movie_txt);
		TextView tv3 = (TextView) findViewById(R.id.radio_txt);
		TextView tv4 = (TextView) findViewById(R.id.teemo_txt);
		tv2.setTypeface(mtypeface);
		tv3.setTypeface(mtypeface);
		tv4.setTypeface(mtypeface);

		ImageButton musicLstBtn = (ImageButton) findViewById(R.id.radio_btn);
		musicLstBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,
						MusicPlayerActivity.class);
				startActivity(intent);
			}
		});

		ImageButton movieBtn = (ImageButton) findViewById(R.id.movie_btn);
		movieBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,
						MoviePlayerActivity.class);
				startActivity(intent);
			}
		});

		ImageButton teemoBtn = (ImageButton) findViewById(R.id.teemo);
		teemoBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,
						TeemoVideoActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
