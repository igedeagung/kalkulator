package com.example.kalkulator;

public class Operan {
    private double angka_pertama;
    private double angka_kedua;

    public double getAngka_pertama() {
        return angka_pertama;
    }

    public double getAngka_kedua() {
        return angka_kedua;
    }

    public Operan(double angka_pertama, double angka_kedua) {
        this.angka_pertama = angka_pertama;
        this.angka_kedua = angka_kedua;
    }
}
