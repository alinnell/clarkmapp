package com.mesalu.clarkmapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		View mapButton = findViewById(R.id.map_button);
		mapButton.setOnClickListener(this);
		View findButton = findViewById(R.id.find_button);
		findButton.setOnClickListener(this);
		View helpButton = findViewById(R.id.help_button);
		helpButton.setOnClickListener(this);
		View labButton = findViewById(R.id.lab_button);
		labButton.setOnClickListener(this);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClick(View v) {
		switch (v.getId()){
		case R.id.help_button:
			Intent i = new Intent(this, HelpActivity.class);
			startActivity(i);
			break;
		}
	}
}
