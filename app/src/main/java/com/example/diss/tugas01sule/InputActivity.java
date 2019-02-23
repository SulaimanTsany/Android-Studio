package com.example.diss.tugas01sule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
    }

    public void saveButton (View view) {
        Toast.makeText(this, "saved", Toast.LENGTH_SHORT).show();
    }
}
