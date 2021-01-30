package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText angka1;
    private EditText angka2;
    private TextView hasilText;
    private Operasi operasi;
    private Operan operan;
    private InputValidation inputValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1=findViewById(R.id.input1);
        angka2=findViewById(R.id.input2);
        hasilText=findViewById(R.id.hasil);

        String angka_pertama_string=angka1.getText().toString().trim();
        String angka_kedua_string=angka2.getText().toString().trim();
        inputValidation=new InputValidation(angka_pertama_string, angka_kedua_string);
    }

    public void setOperan(){
        double angka_pertama=Double.parseDouble(angka1.getText().toString());
        double angka_kedua=Double.parseDouble(angka2.getText().toString());
        operan=new Operan(angka_pertama, angka_kedua);

        operasi=new Operasi();
    }
    public boolean cekInput(){
        if(inputValidation.cekNullAngkaPertama()){
            angka1.setError( "Angka Pertama harus diisi !" );
            angka1.requestFocus();
            return false;
        }
        if(inputValidation.cekNullAngkaKedua()){
            angka2.setError( "Angka Kedua harus diisi !" );
            angka2.requestFocus();
            return false;
        }
        return true;
    }

    @SuppressLint("SetTextI18n")
    public void tambah(View v){
        if(cekInput()) {
            setOperan();
            double hasil=operasi.tambah(operan);
            hasilText.setText(Double.toString(hasil));
        }
    }

    @SuppressLint("SetTextI18n")
    public void kurang(View v){
        if(cekInput()) {
            setOperan();
            double hasil=operasi.kurang(operan);
            hasilText.setText(Double.toString(hasil));
        }
    }

    @SuppressLint("SetTextI18n")
    public void kali(View v){
        if(cekInput()) {
            setOperan();
            double hasil=operasi.kali(operan);
            hasilText.setText(Double.toString(hasil));
        }
    }

    @SuppressLint("SetTextI18n")
    public void bagi(View v){
        if(cekInput()) {
            setOperan();
            double hasil=operasi.bagi(operan);
            hasilText.setText(Double.toString(hasil));
        }
    }
}