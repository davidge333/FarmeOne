package com.example.farmedemo;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class BaseActivity extends FragmentActivity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_base);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		btnOnClick(v);
	}
	
	protected ImageView baseTitleLeftButton() {
		return (ImageView)findViewById(R.id.base_btn_back);
	}
	
	protected ImageView baseTitleRightButton() {
		return (ImageView) findViewById(R.id.base_btn_show);
	}
	
	protected boolean baseTitleText(String content) {
		TextView tv = (TextView) findViewById(R.id.base_title);
		
		if (tv != null) {
			tv.setText("" + content);
			return true;
		}
		
		return false;
	}
	
	protected void baseHideLeftTitleButton(boolean hide) {
		ImageView iv = baseTitleLeftButton();
		
		if (iv != null) {
			if (hide) {
				iv.setVisibility(View.INVISIBLE);
			} else {
				iv.setVisibility(View.VISIBLE);
			}
		}
	}
	
	protected void baseHideRightTitleButton(boolean hide) {
		ImageView iv = baseTitleRightButton();
		
		if (iv != null) {
			if (hide) {
				iv.setVisibility(View.INVISIBLE);
			} else {
				iv.setVisibility(View.VISIBLE);
			}
		}
	}
	
	protected abstract void btnOnClick(View v);
	protected abstract void initLayout();
}
