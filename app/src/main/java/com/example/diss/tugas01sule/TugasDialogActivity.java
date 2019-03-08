package com.example.diss.tugas01sule;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class TugasDialogActivity extends AppCompatActivity {
    static public String text = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_dialog);
    }

    public void dialogButton(View view) {
        AlertDialog.Builder d = new AlertDialog.Builder(this);
        d.setTitle("Input Data");
        LayoutInflater i = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") final View dialogView = i.inflate(R.layout.dialog, null);
        d.setView(dialogView);
        AlertDialog.Builder ok = d.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                EditText nameTV = dialogView.findViewById(R.id.dialog_name);
                EditText nimTV = dialogView.findViewById(R.id.dialog_nim);
                RadioGroup genderRadio = dialogView.findViewById(R.id.radio_group);
                RadioButton radio = (RadioButton) dialogView.findViewById(genderRadio.getCheckedRadioButtonId());
                Spinner spinner = dialogView.findViewById(R.id.spinner_religion);

                String name = nameTV.getText().toString();
                String nim = nimTV.getText().toString();
                String gender = radio.getText().toString();
                String religion = spinner.getSelectedItem().toString();

                Toast.makeText(TugasDialogActivity.super.getApplicationContext(),
                        "Nama = "+name
                        +"\nNIM = "+nim
                        +"\nGender = "+gender
                        +"\nAgama = "+religion
                        , Toast.LENGTH_LONG).show();
            }
        });
        d.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { // TODO Auto-generated method stub
                dialog.dismiss();
            }
        });
        d.show();
    }
}
