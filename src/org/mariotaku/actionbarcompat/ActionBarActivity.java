package org.mariotaku.actionbarcompat;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class ActionBarActivity extends FragmentActivity {

	ActionBarCompat mActionBarCompat = ActionBarCompat.getInstance(this);
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mActionBarCompat.initCompat();
	}
	
	@Override
	public void setContentView(View view) {
		super.setContentView(view);
	}
	
	@Override
	public void setContentView(int layoutResID) {
		super.setContentView(layoutResID);
		mActionBarCompat.initActionBar();
	}
	
	@Override
	public void setContentView(View view, LayoutParams params) {
		super.setContentView(view, params);
		mActionBarCompat.initActionBar();
	}

	@Override
	public void onTitleChanged(CharSequence title, int color) {
		mActionBarCompat.setTitle(title);
		super.onTitleChanged(title, color);
	}
	
	@Override
	public void setTitle(CharSequence title) {
		mActionBarCompat.setTitle(title);
		super.setTitle(title);
	}
	
	@Override
	public void setTitle(int titleId) {
		mActionBarCompat.setTitle(titleId);
		super.setTitle(titleId);
	}
	
	public ActionBarCompat getActionBarCompat() {
		return mActionBarCompat;
	}

}
