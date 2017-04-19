package com.sonne.caicai;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * @author sonne
 * @date   2017-04-19
 * @description The activity of music list.
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
        lstView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getData()));
    }

    private List<String> getData(){
        
        List<String> data = new ArrayList<String>();
        data.add("测试数据1");
        data.add("测试数据2");
        data.add("测试数据3");
        data.add("测试数据4");
         
        return data;
    }

}
