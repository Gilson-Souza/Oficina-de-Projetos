package org.example;

import org.example.dominio.Cliente;
import org.example.dominio.Contrato;
import org.example.dominio.Uso;
import org.example.dominio.plano.PlanoControle;

public class Main {

    public static void main(String[] args) {


        PlanoControle controle = new PlanoControle("Viva mais",40,20);
        Cliente cliente = new Cliente("Nordevaldo Edivando");
        Uso uso = new Uso();
        uso.setDdiEnviado(23);
        uso.setDadosConsumidos(5);
        uso.setDddEnviado(360);
        uso.setSmsEnviado(32);




        Contrato contrato = new Contrato(cliente, controle, uso);


        System.out.println(contrato);
        System.out.println();
        System.out.println("Valor final da conta: "  + controle.calcularConta(contrato));


    }
}