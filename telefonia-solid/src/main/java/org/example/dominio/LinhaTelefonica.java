package org.example.dominio;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.criarPlano.plano.Plano;

@Getter
@Setter

public class LinhaTelefonica {

    private String numero;
    private Plano plano;
    private Uso uso;


    public LinhaTelefonica(String numero, Plano plano, Uso uso) {
        this.numero = numero;
        this.plano = plano;
        this.uso = uso;
    }

}
