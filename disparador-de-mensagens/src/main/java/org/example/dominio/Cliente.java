package org.example.dominio;

public class Cliente {

    private String nome;
    private String telefone;
    private String email;


    public Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.email = "gilsonpro10@gmail.com";
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

    public void setEmail(String email) {this.email = email;}

    public String getEmail() {return email;}
}
