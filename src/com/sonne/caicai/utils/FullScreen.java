package com.sonne.caicai.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

public class FullScreen extends VideoView {
	public FullScreen(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public FullScreen(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public FullScreen(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {// ������дonMeasure�ķ���
		// TODO Auto-generated method stub
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		int width = getDefaultSize(0, widthMeasureSpec);// �õ�Ĭ�ϵĴ�С��0����Ȳ����淶��
		int height = getDefaultSize(0, heightMeasureSpec);// �õ�Ĭ�ϵĴ�С��0���߶ȶȲ����淶��
		setMeasuredDimension(width, height); // ���ò����ߴ�,���ߺͿ�Ž�ȥ
	}
}
