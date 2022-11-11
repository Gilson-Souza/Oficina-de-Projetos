package org.example.dominio.criarPlano.plano;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Plano {

    protected String nome;
    protected int ligacaoDDDGratis;
    protected int ligacaoDDIGratis;
    protected int linhaTelefonica;


}
