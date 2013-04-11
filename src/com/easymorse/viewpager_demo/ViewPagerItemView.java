package com.easymorse.viewpager_demo;import android.content.Context;import android.util.AttributeSet;import android.view.LayoutInflater;import android.widget.ImageView;import android.widget.LinearLayout;public class ViewPagerItemView extends LinearLayout{	private ImageView imageView;		public ViewPagerItemView(Context context, AttributeSet attrs) {		super(context, attrs);		initView(context);	}	public ViewPagerItemView(Context context) {		super(context);		initView(context);	}		private void initView(Context context){		LayoutInflater.from(context).inflate(R.layout.image_item, this, true);		imageView = (ImageView) this.findViewById(R.id.imageView);	}		public void setData(int drawableId){		imageView.setImageResource(drawableId);//		imageView.invalidate();	}}