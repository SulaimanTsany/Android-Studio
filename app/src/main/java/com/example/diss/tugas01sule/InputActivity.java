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
    TextView tg_d;
    TextView tg_m;
    TextView tg_y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        name = findViewById(R.id.input_name);
        nim = findViewById(R.id.input_nim);
        address = findViewById(R.id.input_address);
        phone = findViewById(R.id.input_phone);
        email = findViewById(R.id.input_email);
        tg_d = findViewById(R.id.input_birthday_d);
        tg_m = findViewById(R.id.input_birthday_m);
        tg_y = findViewById(R.id.input_birthday_y);

        Intent intent = getIntent();
        if (intent != null) {
            name.setText(intent.getStringExtra("name"));
            nim.setText(intent.getStringExtra("nim"));
            address.setText(intent.getStringExtra("address"));
            phone.setText(intent.getStringExtra("phone"));
            email.setText(intent.getStringExtra("email"));
        }
    }

    public void saveButton (View view) {
        String birthday = tg_d.getText().toString() +" "+ tg_m.getText().toString() +" "+ tg_y.getText().toString();
        Toast.makeText(this, "saved", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("name", name.getText().toString());
        intent.putExtra("nim", nim.getText().toString());
        intent.putExtra("address", address.getText().toString());
        intent.putExtra("phone", phone.getText().toString());
        intent.putExtra("email", email.getText().toString());
        intent.putExtra("birthday", birthday);

        startActivity(intent);
        this.finish();
    }
}
