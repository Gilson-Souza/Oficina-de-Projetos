package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class Mentoria extends Conteudo{


    private static final double XP_PADRAO = 10d;

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria [" + "\n" +
                "Titulo = " + titulo + "\n" +
                "Descricao = " + descricao + "\n" +
                "Data = " + data + "\n" +
                "]";
    }
}
