package com.example.uts_mp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pengurangan extends AppCompatActivity {

    TextView input1, input2, operator, result, notif;
    EditText textField1, textField2;
    Button btHitung;

    private int operation = 0;
    private double HasilAkhir = 0.0;
    private String Cek1 = "";
    private String Cek2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengurangan);

        input1 = (TextView) findViewById(R.id.angkaPertama);
        input2 = (TextView) findViewById(R.id.angkaKedua);
        operator = (TextView) findViewById(R.id.operasi);
        result = (TextView) findViewById(R.id.hasil);

        btHitung = (Button) findViewById(R.id.button);
    }
    public void klikHitung(View V) {
        double inputA = Double.parseDouble(input1.getText().toString());
        double inputB = Double.parseDouble(input2.getText().toString());
        HasilAkhir = inputA - inputB;
        String hasilString = String.valueOf(HasilAkhir);
        result.setText(hasilString);

        if ((Cek1.equalsIgnoreCase("")) || (Cek2.equalsIgnoreCase(""))) {
            Toast.makeText(this, "Kolom Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
        }
    }
}