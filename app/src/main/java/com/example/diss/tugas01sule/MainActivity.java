package com.example.diss.tugas01sule;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.textView2);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/fontawesome-webfont.ttf");
        tv.setTypeface(tf);
    }
}

