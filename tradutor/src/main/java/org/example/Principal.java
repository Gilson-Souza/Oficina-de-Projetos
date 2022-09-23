package org.example;

import org.example.dominio.*;

public class Principal {

    public static void main(String[] args) {

                Traducao traducao = new Traducao();
                traducao.addTradutor(new TradutorItaliano());
                traducao.addTradutor(new TradutorIngles());
                traducao.addTradutor(new TradutorEspanhol());

                traducao.traduzir("Buon giorno! Hello, como estas?");


        }
                // Bom dia! Olá, como está?


}








