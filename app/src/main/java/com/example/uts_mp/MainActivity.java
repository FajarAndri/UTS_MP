package com.example.uts_mp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        };

    public void penambahan(View v) {
        Intent i = new Intent(this, Penambahan.class);
        startActivity(i);
    }

    public void pengurangan(View v) {
        Intent i = new Intent(this, Pengurangan.class);
        startActivity(i);
    }

    public void perkalian(View v) {
        Intent i = new Intent(this, Perkalian.class);
        startActivity(i);
    }

    public void pembagian(View v) {
        Intent i = new Intent(this, Pembagian.class);
        startActivity(i);
    }
}