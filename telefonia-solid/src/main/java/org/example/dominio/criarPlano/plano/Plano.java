package org.example.dominio.criarPlano.plano;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.Cliente;

@Getter
@Setter

public abstract class Plano {

    protected String nome;
    protected int ligacaoDDDGratis;
    protected int ligacaoDDIGratis;


}
