package org.example.dominio;

public class Cliente {

    private String nome;
    private String telefone;
    private Conta conta;
    private String email;

    public Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.conta = new Conta("011325-2", 2500);
        this.email = "gilsonpro10@gmail.com";
    }

    public double valorInicial(){
        double valorInicial = 0;
        valorInicial  = conta.getSaldoCorrente();
        return valorInicial;
    }
    
    public double valorSacado(){
        double valorSacado = 0;
        valorSacado = valorInicial() - conta.getSaldoCorrente();
        return valorSacado;
    }
  
    public double contaAtualizada(){
        double contaAtualizada = 0;
        contaAtualizada = conta.getSaldoCorrente();
        return contaAtualizada;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void setEmail(String email) {this.email = email;}

    public String getEmail() {return email;}
}
