package com.mesalu.clarkmapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

public class MapActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		
		View mcButton = findViewById(R.id.maincampus_button);
		mcButton.setOnClickListener(this);
		View wsuButton = findViewById(R.id.wsu_button);
		wsuButton.setOnClickListener(this);
		
		Log.d("MapActivity", "oncreate finished");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map, menu);
		return true;
	}

	public void onClick(View v) {
		ImageView iv;
		Bitmap bm;
		switch (v.getId()) {
		case R.id.maincampus_button:
			iv = (ImageView) findViewById(R.id.map_img_view);
			bm = BitmapFactory.decodeResource(getResources(), R.drawable.clarkimg); //replace with
															// main campus image later
			iv.setImageBitmap(bm);
			break;
		case R.id.wsu_button:
			iv = (ImageView) findViewById(R.id.map_img_view);
			bm = BitmapFactory.decodeResource(getResources(), R.drawable.splash);
							// replace with wsu building map later.
			iv.setImageBitmap(bm);
			break;
		// add case for ctc later.
		}
	}
}
