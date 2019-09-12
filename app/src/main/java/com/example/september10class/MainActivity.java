package com.example.september10class;

import android.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

class MainActivity : AppCompatActivity() {

    @override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)


        MySurfaceView theSV = (MySurfaceView)findViewById(R.id.surfaceView2);
        SeekBar mySeekBar = (SeekBar)findViewById(R.id.seekBar);
        TheSeekBarListener myListener = new TheSeekBarListener(theSV);
        mySeekBar.setOnSeekBarChangeListener(myListener);



    }


}
