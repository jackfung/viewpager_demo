package com.easymorse.viewpager_demo;import java.util.ArrayList;import java.util.List;import java.util.Map;import android.app.Activity;import android.content.Context;import android.os.Parcelable;import android.support.v4.view.PagerAdapter;import android.support.v4.view.ViewPager;import android.view.View;import android.view.ViewGroup;public class MyViewPagerAdapter extends PagerAdapter {	private List<Map<?, ?>> list = new ArrayList<Map<?, ?>>();	private Activity mContext;	public MyViewPagerAdapter(Context context) {		mContext = (Activity) context;	}	public void setData(List<Map<?, ?>> list) {		this.list.clear();		this.list.addAll(list);		notifyDataSetChanged();	}	// 视图总数	@Override	public int getCount() {		return list.size();	}	@Override	public boolean isViewFromObject(View arg0, Object arg1) {		return arg0 == arg1;	}	@Override	public void destroyItem(View arg0, int arg1, Object arg2) {		((ViewPager) arg0).removeView((View) arg2);	}	@Override	public void finishUpdate(View arg0) {	}	@Override	public Object instantiateItem(ViewGroup arg0, int arg1) {		ViewPagerItemView view  = new ViewPagerItemView(mContext); 		view.setData((Integer) list.get(arg1).get("drawableId"));		arg0.addView(view);		return view;	}	@Override	public void restoreState(Parcelable arg0, ClassLoader arg1) {	}	@Override	public Parcelable saveState() {		return null;	}	@Override	public void startUpdate(View arg0) {	}//	/**//	 * 将文字绑定到PagerTabStrip上。//	 *///	@Override//	public CharSequence getPageTitle(int position) {//		System.out.println("positon:" + position);//		return list.get(position).get("name").toString();//	}}