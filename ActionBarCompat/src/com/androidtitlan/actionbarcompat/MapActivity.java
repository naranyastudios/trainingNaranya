package com.androidtitlan.actionbarcompat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class MapActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
	}
}
