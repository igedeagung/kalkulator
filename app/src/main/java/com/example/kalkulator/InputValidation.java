package com.example.kalkulator;

public class InputValidation {
    private String angka_pertama;
    private String angka_kedua;

    public InputValidation(String angka_pertama, String angka_kedua) {
        this.angka_pertama = angka_pertama;
        this.angka_kedua = angka_kedua;
    }

    public boolean cekNullAngkaPertama(){
        return this.angka_pertama.equals("");
    }
    public boolean cekNullAngkaKedua(){
        return this.angka_kedua.equals("");
    }
}
