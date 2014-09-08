package com.example.test;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class DrawActivity extends Activity {
	DrawView drawView;
	String[] pass;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_draw);
		Intent i = getIntent(); //This should be getIntent();
	    pass = new String[4];

	    pass = i.getStringArrayExtra("coordinates");
		
	    Log.i("NOTES", pass[0]);
	    int x1 = Integer.parseInt(pass[0]);
		int y1 = Integer.parseInt(pass[1]);
		int x2 = Integer.parseInt(pass[2]);
		int y2 = Integer.parseInt(pass[3]);
		
		
		drawView = new DrawView(this);
		drawView.assign(x1,y1,x2,y2);
		drawView.setBackgroundColor(Color.LTGRAY);
		setContentView(drawView);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.draw, menu);
		return true;
	}

}
