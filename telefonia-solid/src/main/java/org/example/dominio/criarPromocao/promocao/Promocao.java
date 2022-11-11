package org.example.dominio.criarPromocao.promocao;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.criarPromocao.IPromocao;

import java.time.LocalDate;

@Getter
@Setter

public abstract class Promocao implements IPromocao {


    protected String nome;
    protected String descricao;
    protected LocalDate dataInicio;
    protected int quantidadeDias;


}
