package org.example.dominio;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.criarPlano.plano.Plano;
import org.example.dominio.criarPromocao.IPromocao;

@Getter
@Setter

public class Contrato {

    private Cliente cliente;
    private Plano plano;
    private IPromocao promocao;
    private Uso uso;

    public Contrato(Cliente cliente, Plano plano, Uso uso) {
        this.cliente = cliente;
        this.plano = plano;
        this.uso = uso;
    }

    public void contratarPromocao(IPromocao promocao){
        this.promocao = promocao;
    }

    @Override
    public String toString() {
        return " " + cliente + " " + plano + " " + uso;
    }


}
