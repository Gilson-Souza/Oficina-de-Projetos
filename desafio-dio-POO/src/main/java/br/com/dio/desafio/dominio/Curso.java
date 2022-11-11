package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Curso extends Conteudo{

    public Curso() {
    }
    protected int cargaHoraria;


    @Override
    public String toString() {
        return "Curso [" + "\n" +
                "Titulo = " + titulo + "\n" +
                "Descricao = " + descricao + "\n" +
                "CargaHoraria = " + cargaHoraria +"\n" + "]";
    }



    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }
}
