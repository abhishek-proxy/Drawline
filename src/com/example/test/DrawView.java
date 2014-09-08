package com.example.test;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawView extends View {
int x1,y1,x2,y2;
	

Paint paint = new Paint();

public void assign(int corx1,int cory1,int corx2,int cory2)
{
	x1 = corx1;
	y1 = cory1;
	x2 = corx2;
	y2 = cory2;

}
public DrawView(Context context) {
super(context);
paint.setColor(Color.BLACK);
}
@Override
public void onDraw(Canvas canvas) {
canvas.drawLine(x1,y1,x2,y2, paint);

}

}