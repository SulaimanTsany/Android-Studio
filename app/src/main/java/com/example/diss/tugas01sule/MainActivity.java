package com.example.diss.tugas01sule;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Button button = findViewById(R.id.edit_button);

//        button.setOnClickListener(new View.OnClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.M)
//            public void onClick(View v) {
//                // random a color
//                Random rnd = new Random();
//                int color = Color.argb(255, rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
//                button.setBackgroundColor(color);
//            }
//        });
    }

    public void editButton(View view) {
        Intent intent = new Intent(this, InputActivity.class);
        startActivity(intent);
        this.finish();
    }
}

