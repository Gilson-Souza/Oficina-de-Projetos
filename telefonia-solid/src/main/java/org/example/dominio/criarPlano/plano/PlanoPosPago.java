package org.example.dominio.criarPlano.plano;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PlanoPosPago extends Plano{

    private double valorPlano;




    @Override
    public String toString() {
        return "\nPlano: " + getNome();
    }
}

