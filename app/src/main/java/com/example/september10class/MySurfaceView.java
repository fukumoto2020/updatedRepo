package com.example.september10class;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;

public class MySurfaceView extends SurfaceView {
    private int radius;

    public MySurfaceView(Context context, AttributeSet attrs){
        super(context,attrs);
        setWillNotDraw(false);
        radius = 0;
    }

    public void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(5.0f);

        canvas.drawRect(200, 200, 400, 400, paint);

        Bitmap theImg = BitmapFactory.decodeResource(getResources(), R.drawable.myimage);
        canvas.drawBitmap(theImg, 100, 10,  null);


    }

    public void setRadius(int r){
        radius = r;
        invalidate();
        //for debugging in logcat
        Log.i("MySurfaceView.setRadius", "I just set the radius");
    }
}
