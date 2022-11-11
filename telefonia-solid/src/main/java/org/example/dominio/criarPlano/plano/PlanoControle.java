package org.example.dominio.criarPlano.plano;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PlanoControle extends Plano {

    public PlanoControle(String nome, int ligacaoDDDGratis, int ligacaoDDIGratis, int linhaTelefonica) {
        super(nome, ligacaoDDDGratis, ligacaoDDIGratis, linhaTelefonica);

    }

    @Override
    public String toString() {
        return "\nPlano: " + getNome();
    }
}
