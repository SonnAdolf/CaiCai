package com.sonne.caicai;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * @author sonne
 * @date   2017-04-19
 * @description The activity of music list.
 *              2017-04-28 add the onclick listener of listview.
 */
public class MusicLstActivity  extends Activity {
	
	public static final String TAG = "MusicLstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.music_lst_layout);
        ListView lstView = (ListView)findViewById(R.id.music_list_view);
        final List<String> lst = getData();
        lstView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,lst));
        lstView.setOnItemClickListener(new OnItemClickListener(){
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				if (lst.get(arg2).equals("butter fly")) {
					Intent intent = new Intent(MusicLstActivity.this, MusicPlayerActivity.class);
					startActivity(intent);
				}
			}
        });
    }

    private List<String> getData(){
        
        List<String> data = new ArrayList<String>();
        data.add("butter fly");
        data.add("µ¾Ïã");
        data.add("Faded--Alan Walker");
        data.add("Good for you--Selena Gomez");
        data.add("Red Light--f(x)");
        data.add("Why So Lonely--Wonder Girls");
        data.add("We Don't Talk Anymore");
        data.add("The Saltwater Room");
        data.add("IF YOU--Bigbang");
        data.add("Riptide--Vance Joy");
         
        return data;
    }

}
