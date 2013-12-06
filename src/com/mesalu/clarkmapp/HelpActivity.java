package com.mesalu.clarkmapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class HelpActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
		
		View contactButton = findViewById(R.id.contact_button);
		contactButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.help, menu);
		return true;
	}
	
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.contact_button:
			Intent i = new Intent(this, ContactActivity.class);
			startActivity(i);
		}
	}

}
