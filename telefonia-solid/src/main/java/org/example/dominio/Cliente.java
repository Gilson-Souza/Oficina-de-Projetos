package org.example.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cliente{

    private String nome;
    private Contrato contrato;



    public Cliente(String nome){
        this.nome = nome;

    }

    @Override
    public String toString() {
        return  "\t\tCliente: " + getNome();

    }
}
