package org.example.dominio;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.plano.Plano;
import org.example.dominio.promocao.Promocao;

@Getter
@Setter

public class Contrato {

    private Cliente cliente;
    private Plano plano;
    private Promocao promocao;
    private Uso uso;

    public Contrato(Cliente cliente, Plano plano, Uso uso) {
        this.cliente = cliente;
        this.plano = plano;
        this.uso = uso;
    }

    public Contrato() {
    }

    public void contratarPromocao(Promocao promocao){
        this.promocao = promocao;
    }

    @Override
    public String toString() {
        return " " + cliente + " " + plano + " " + uso;
    }


}
