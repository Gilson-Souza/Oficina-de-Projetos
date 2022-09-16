package org.example.dominio;

public class Conta {

    private String numero;

    private double saldoCorrente;


    public Conta(String numero, int saldoCorrente) {
        this.numero = numero;
        this.saldoCorrente = saldoCorrente;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldoCorrente() {
        return saldoCorrente;
    }

    public void setSaldoCorrente(double saldoCorrente) {
        this.saldoCorrente = saldoCorrente;
    }


}