package com.example.aplikasikereta;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class pemesanan extends AppCompatActivity {

    String hasil;
    RadioGroup radioGroup;
    RadioButton radioButton, radioButton2, radioButton3;
    Button buttonPilih;
    TextView pilihan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cetakhasil);

        radioGroup = findViewById(R.id.radio_grup);
        radioButton = findViewById(R.id.radio_button_1);
        radioButton2 = findViewById(R.id.radio_button_2);
        radioButton3 = findViewById(R.id.radio_button_3);

        buttonPilih = findViewById(R.id.button2);
        pilihan = findViewById(R.id.hasil);
        buttonPilih.setOnClickListener(view -> {
            if (radioButton.isChecked()) {
                hasil = radioButton.getText().toString();
            } else if (radioButton2.isChecked()) {
                hasil = radioButton2.getText().toString();
            } else if (radioButton3.isChecked()) {
                hasil = radioButton3.getText().toString();
            } else {
                Toast.makeText(getApplicationContext(), "Pilih salah satu...", Toast.LENGTH_SHORT).show();
            }
            pilihan.setText(hasil);
        });

        Button button2 = findViewById(R.id.button);
        button2.setOnClickListener(arg0 -> {
            // TODO Auto-generated method stub
            Intent i = new Intent(getApplicationContext(), pemesanan.class);
            startActivity(i);
        });
    }}
