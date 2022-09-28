package org.example.dominio;

public class Conta {

    private String numero;

    private double saldoCorrente;

    private double ValorIncial;

    public double getValorIncial() {
        return ValorIncial;
    }

    public void setValorIncial(double valorIncial) {
        ValorIncial = valorIncial;
    }

    private Cliente cliente;

    private IEnviar enviar;




    public Conta(String numero, int saldoCorrente, Cliente cliente) {
        this.numero = numero;
        this.saldoCorrente = saldoCorrente;
        this.enviar = enviar;

    }
    public double valorInicial(){
        double valorInicial = 0;
        valorInicial  = getSaldoCorrente();
        return valorInicial;
    }

    public double valorSacado(){
        double valorSacado = 0;
        valorSacado = getValorIncial() - getSaldoCorrente();
        return valorSacado;
    }

    public double contaAtualizada(){
        double contaAtualizada = 0;
        contaAtualizada = getSaldoCorrente();
        return contaAtualizada;
    }

    public void sacar(double valor) {
        double contaAtualizada = 0;
        valorInicial();
        contaAtualizada = getSaldoCorrente() - valor;
        setSaldoCorrente(contaAtualizada);
        valorSacado();
        contaAtualizada();

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public IEnviar getEnviar() {
        return enviar;
    }

    public void setEnviar(IEnviar enviar) {
        this.enviar = enviar;
    }
}
