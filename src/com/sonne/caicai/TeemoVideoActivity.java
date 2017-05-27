package com.sonne.caicai;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.VideoView;

public class TeemoVideoActivity extends Activity {
	
	public static final String TAG = "TeemoVideoActivity";

	private VideoView videoView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teemo_video_layout);

		String videoUrl2 = "http://119.29.173.183:8080/movie/20170413-22-2-53s.avi";

		Uri uri = Uri.parse(videoUrl2);

		videoView = (VideoView) this.findViewById(R.id.videoView);

		// ������Ƶ������
		videoView.setMediaController(new MediaController(this));

		// ������ɻص�
		videoView.setOnCompletionListener(new MyPlayerOnCompletionListener());

		// ������Ƶ·��
		videoView.setVideoURI(uri);
		RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
				RelativeLayout.LayoutParams.FILL_PARENT,
				RelativeLayout.LayoutParams.FILL_PARENT);
		layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
		layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
		layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		videoView.setLayoutParams(layoutParams);

		// ��ʼ������Ƶ
		videoView.start();
	}

	class MyPlayerOnCompletionListener implements
			MediaPlayer.OnCompletionListener {

		@Override
		public void onCompletion(MediaPlayer mp) {
			Toast.makeText(TeemoVideoActivity.this, "���������",
					Toast.LENGTH_SHORT).show();
		}
	}
}
