package org.example.dominio.plano;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.Contrato;

@Setter
@Getter

public class PlanoPrePago extends Plano {
    private double saldo;

    public PlanoPrePago(String nome, int ligacaoDDDGratis, int ligacaoDDIGratis) {
        super(nome, ligacaoDDDGratis, ligacaoDDIGratis);
        this.nome = nome;
        this.ligacaoDDDGratis = ligacaoDDDGratis;
        this.ligacaoDDIGratis = ligacaoDDIGratis;
    }

    public void recarga(double valor){
        this.saldo = valor;
    }

    @Override
    public String toString() {
        return "\nPlano: " + getNome();
    }

    @Override
    public double calcularConta(Contrato contrato) {
        return 0;
    }
}
