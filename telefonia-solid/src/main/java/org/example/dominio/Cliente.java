package org.example.dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Cliente{

    private String nome;
    private String cpf;
    private Contrato contrato;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return  "\t\tCliente: " + getNome() + " " + getCpf();

    }
}
