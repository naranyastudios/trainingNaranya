package com.essentialab.layouts;

import android.os.Bundle;
import android.app.Activity;

public class FrameLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frame_layout);
		setTitle("FrameLayout");
	}
}
