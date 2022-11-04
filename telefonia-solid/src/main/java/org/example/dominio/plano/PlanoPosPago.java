package org.example.dominio.plano;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.Contrato;

@Getter
@Setter

public class PlanoPosPago extends Plano{

    private double valorPlano;

    public PlanoPosPago(double valorPlano,String nome, int ligacaoDDDGratis, int ligacaoDDIGratis) {
        super(nome, ligacaoDDDGratis, ligacaoDDIGratis);
        this.valorPlano = valorPlano;
        this.nome = nome;
        this.ligacaoDDDGratis = ligacaoDDDGratis;
        this.ligacaoDDIGratis = ligacaoDDIGratis;
    }
    @Override
    public String toString() {
        return "\nPlano: " + getNome();
    }

    @Override
    public double calcularConta(Contrato contrato) {
        return getValorPlano();
    }
}

