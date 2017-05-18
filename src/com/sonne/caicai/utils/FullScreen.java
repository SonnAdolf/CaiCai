package com.sonne.caicai.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * @author sonne
 * @date   2017-05-17
 * @description user-defined VideoView used to implement fullscreen.
 */
public class FullScreen extends VideoView {
	public FullScreen(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public FullScreen(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public FullScreen(Context context) {
		super(context);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {// 这里重写onMeasure的方法
		// TODO Auto-generated method stub
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		int width = getDefaultSize(0, widthMeasureSpec);// 得到默认的大小（0，宽度测量规范）
		int height = getDefaultSize(0, heightMeasureSpec);// 得到默认的大小（0，高度度测量规范）
		setMeasuredDimension(width, height); // 设置测量尺寸,将高和宽放进去
	}
}
