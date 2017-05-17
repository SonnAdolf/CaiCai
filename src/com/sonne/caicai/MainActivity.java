package com.sonne.caicai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

/**
 * @author sonne
 * @date   2017-04-19
 * @description The activity of main page.
 */
public class MainActivity extends Activity {
	
	public static final String TAG = "MainActivity";
	
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
		Button musicLstBtn = (Button) findViewById(R.id.music_btn);
		musicLstBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//Intent intent = new Intent(MainActivity.this, MusicLstActivity.class);
				//startActivity(intent);
				Intent intent = new Intent(MainActivity.this, MusicPlayerActivity.class);
				startActivity(intent);
			}
		});
		
		Button movieBtn = (Button) findViewById(R.id.movie_btn);
		movieBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//Intent intent = new Intent(MainActivity.this, MusicLstActivity.class);
				//startActivity(intent);
				Intent intent = new Intent(MainActivity.this, MoviePlayerActivity.class);
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
