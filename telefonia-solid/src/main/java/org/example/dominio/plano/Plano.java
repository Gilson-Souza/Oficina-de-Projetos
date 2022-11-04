package org.example.dominio.plano;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Plano implements IPlano {

    protected String nome;
    protected int ligacaoDDDGratis;
    protected int ligacaoDDIGratis;

    public Plano(String nome, int ligacaoDDDGratis, int ligacaoDDIGratis) {
        this.nome = nome;
        this.ligacaoDDDGratis = ligacaoDDDGratis;
        this.ligacaoDDIGratis = ligacaoDDIGratis;
    }



}
