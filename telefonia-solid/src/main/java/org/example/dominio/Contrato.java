package org.example.dominio;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.criarPlano.IPlano;
import org.example.dominio.criarPlano.plano.Plano;
import org.example.dominio.criarPromocao.IPromocao;

import java.util.List;

@Getter
@Setter

public class Contrato {

    private Cliente cliente;
    private List<IPromocao> promocao;
    private List<LinhaTelefonica> linhas;

    public Contrato(Cliente cliente, List<LinhaTelefonica> linhas) {
        this.cliente = cliente;
        this.linhas = linhas;

    }

    public void contratarPromocao(List<IPromocao> promocao){
        this.promocao = promocao;
    }

    @Override
    public String toString() {
        return " " + cliente + " "  + linhas;
    }


}
