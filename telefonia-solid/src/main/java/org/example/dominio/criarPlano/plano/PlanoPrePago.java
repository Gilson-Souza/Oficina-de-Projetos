package org.example.dominio.criarPlano.plano;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class PlanoPrePago extends Plano {
    private double saldo;



    public void recarga(double valor){
        this.saldo = valor;
    }

    @Override
    public String toString() {
        return "\nPlano: " + getNome();
    }

}
