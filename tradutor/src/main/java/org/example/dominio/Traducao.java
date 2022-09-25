package org.example.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Traducao {

    private ITraducao traducao;

    public void traduzir(String text) {
        String[] textoSeparado = text.split("[(?,!)\s]");
        for (int i = 0; i < traducao.getPalavrasParaTraduzir().length; i++) {
            if (traducao.getPalavrasParaTraduzir()[i].equals(textoSeparado[i])){
                System.out.println("Achei");
            }else{
                System.out.println("Não achei");
            }

        }

    }


    public void addTradutor(ITraducao tradutor) {
    }

}
