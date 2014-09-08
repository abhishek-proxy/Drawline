package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	GLSurfaceView glSurfaceView;
	
	
EditText x1;
EditText y1;
EditText x2;
EditText y2;
Button b;
String[] pass = new String[4];

@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main); 
glSurfaceView = new GLSurfaceView(this);

x1 = (EditText) findViewById(R.id.X1);
y1 = (EditText) findViewById(R.id.Y1); 
x2 = (EditText) findViewById(R.id.X2);
y2 = (EditText) findViewById(R.id.Y2);

b = (Button) findViewById(R.id.bFind);
b.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
	
		String cox1 = x1.getText().toString();
		pass[0] = cox1;
		String coy1 = y1.getText().toString();
		pass[1] = coy1;
		String cox2 = x2.getText().toString();
		pass[2] = (cox2);
		String coy2 = y2.getText().toString();
		pass[3] = coy2;
		
		Intent intent = new Intent(MainActivity.this, DrawActivity.class);
	    intent.putExtra("coordinates", pass);
	    startActivity(intent);
	        
		
		
		
		
		
	}
});





}
}