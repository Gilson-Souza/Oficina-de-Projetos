package org.example.dominio.promocao;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public abstract class Promocao implements IPromocao{

    protected String nome;
    protected String descricao;
    protected LocalDate dataInicio;
    protected int quantidadeDias;


    @Override
    public String toString() {
        return getNome();
    }


}
