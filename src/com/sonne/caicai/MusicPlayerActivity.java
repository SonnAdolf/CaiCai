package com.sonne.caicai;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

/**
 * @author sonne
 * @date   2017-04-28
 * @description The activity of music player.
 */
public class MusicPlayerActivity extends Activity {
	
	public static final String TAG = "MusicPlayerActivity";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.music_player_layout);
    }
}
