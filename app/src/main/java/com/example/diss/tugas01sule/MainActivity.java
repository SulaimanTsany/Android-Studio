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
    TextView name;
    TextView nim;
    TextView address;
    TextView phone;
    TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        nim = findViewById(R.id.nim);
        address = findViewById(R.id.address);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);

//        Bundle bundle = getIntent().getExtras();
//        name.setText(bundle.getString("name", getString(R.string.name)));
//        nim.setText(bundle.getString("nim", getString(R.string.student_id)));
//        address.setText(bundle.getString("address", getString(R.string.address)));
//        phone.setText(bundle.getString("phone", getString(R.string.phone_number)));
//        email.setText(bundle.getString("email", getString(R.string.email)));

        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        nim.setText(intent.getStringExtra("nim"));
        address.setText(intent.getStringExtra("address"));
        phone.setText(intent.getStringExtra("phone"));
        email.setText(intent.getStringExtra("email"));

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

