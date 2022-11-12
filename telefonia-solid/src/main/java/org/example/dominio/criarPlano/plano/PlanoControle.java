package org.example.dominio.criarPlano.plano;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PlanoControle extends Plano {


    @Override
    public String toString() {
        return "\nPlano: " + getNome();
    }


}
