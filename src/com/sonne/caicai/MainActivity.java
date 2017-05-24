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
 * @date   2017-04-19
 * @description The activity of main page.
 */
public class MainActivity extends Activity {
	
	public static final String TAG = "MainActivity";
	
    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
		if (savedInstanceState != null) {
			String tempData = savedInstanceState.getString("data_key");
			Log.d(TAG, tempData);
		}
		

	    int s = new Random().nextInt(2)+1;
		
		RelativeLayout rl = (RelativeLayout)findViewById(R.id.main_layout);
		Drawable drawable=getResources().getDrawable(R.drawable.background_main); 
		Drawable drawable2=getResources().getDrawable(R.drawable.background_main2); 
		
		if (s == 1) {
			rl.setBackground(drawable);
		} else {
			rl.setBackground(drawable2);
		}
		
		TextView tv1 = (TextView)findViewById(R.id.main_words); 
		tv1.getPaint().setFakeBoldText(true);
		Typeface mtypeface=Typeface.createFromAsset(getAssets(),"huakangshaonv.ttf");
		tv1.setTypeface(mtypeface);
		
		TextView tv2 = (TextView)findViewById(R.id.movie_txt);
		TextView tv3 = (TextView)findViewById(R.id.radio_txt);
		TextView tv4 = (TextView)findViewById(R.id.teemo_txt);
		tv2.setTypeface(mtypeface);
		tv3.setTypeface(mtypeface);
		tv4.setTypeface(mtypeface);
		
		
		ImageButton musicLstBtn = (ImageButton) findViewById(R.id.radio_btn);
		musicLstBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, MusicPlayerActivity.class);
				startActivity(intent);
			}
		});
		
		ImageButton movieBtn = (ImageButton) findViewById(R.id.movie_btn);
		movieBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, MoviePlayerActivity.class);
				startActivity(intent);
			}
		});
		
		ImageButton teemoBtn = (ImageButton) findViewById(R.id.teemo);
		teemoBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, TeemoVideoActivity.class);
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
