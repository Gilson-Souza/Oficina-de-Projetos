package org.example.dominio.criarPlano.plano;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PlanoPosPago extends Plano{

    private double valorPlano;

    public PlanoPosPago(String nome, int ligacaoDDDGratis, int ligacaoDDIGratis, int linhaTelefonica, double valorPlano) {
        super(nome, ligacaoDDDGratis, ligacaoDDIGratis, linhaTelefonica);
        this.valorPlano = valorPlano;
    }


    @Override
    public String toString() {
        return "\nPlano: " + getNome();
    }
}

