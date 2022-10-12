package br.com.dio;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setCargaHoraria(4);
        curso.setDescricao("Java");
        curso.setTitulo("Java Orientaçao Objetos");

        Curso curso1 = new Curso();
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Curso de HTML com CSS");
        curso1.setTitulo("HTML & CSS");

        Mentoria mentoria = new Mentoria();
        mentoria.setDescricao("Mentoria de java OO");
        mentoria.setTitulo("Java OO");
        mentoria.setData(LocalDate.now());

        Bootcamp boot = new Bootcamp();
        boot.setNome("Java Developer");
        boot.setDescricao("Descrição Bootcamp java developer");
        boot.getConteudos().add(curso);
        boot.getConteudos().add(curso1);
        boot.getConteudos().add(mentoria);

        Dev gilson = new Dev();
        gilson.setNome("Gilson");

        Dev paula = new Dev();
        paula.setNome("Ana Paula");

        gilson.inscreverBootcamp(boot);
        System.out.println("Conteudos Inscritos Gilson : " + gilson.getConteudosInscritos());
        gilson.progredir();
        System.out.println("------------------------------");
        System.out.println("Conteudos Inscritos Gilson : " + gilson.getConteudosInscritos());
        System.out.println("-------------------------------");
        System.out.println("Conteudos Concluidos Gilson : " + gilson.getConteudosConcluidos());
        System.out.println("XP - "+ gilson.calcularTotal());
        System.out.println("\n\n");

        paula.inscreverBootcamp(boot);
        System.out.println("Conteudos Inscritos Paula : " + paula.getConteudosInscritos());
        paula.progredir();
        paula.progredir();
        paula.calcularTotal();
        System.out.println("------------------------------");
        System.out.println("Conteudos Inscritos Paula : " + paula.getConteudosInscritos());
        System.out.println("-------------------------------");
        System.out.println("Conteudos Concluidos Paula : " + paula.getConteudosConcluidos());
        System.out.println("XP - " + paula.calcularTotal());



    }

}