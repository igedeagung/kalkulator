package com.example.kalkulator;

public class Operasi {


    public double tambah(Operan operan){
        return operan.getAngka_pertama()+operan.getAngka_kedua();
    }

    public double kurang(Operan operan){
        return operan.getAngka_pertama()-operan.getAngka_kedua();
    }

    public double kali(Operan operan){
        return operan.getAngka_pertama()*operan.getAngka_kedua();
    }

    public double bagi(Operan operan){
        return operan.getAngka_pertama()/operan.getAngka_kedua();
    }
}
