package com.example.diss.tugas01sule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    TextView name;
    TextView nim;
    TextView address;
    TextView phone;
    TextView email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        name = findViewById(R.id.input_name);
        nim = findViewById(R.id.input_nim);
        address = findViewById(R.id.input_address);
        phone = findViewById(R.id.input_phone);
        email = findViewById(R.id.input_email);
    }

    public void saveButton (View view) {
        Toast.makeText(this, "saved", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("name", name.getText());
        intent.putExtra("nim", nim.getText());
        intent.putExtra("address", address.getText());
        intent.putExtra("phone", phone.getText());
        intent.putExtra("email", email.getText());
        startActivity(intent);
        this.finish();
    }
}
