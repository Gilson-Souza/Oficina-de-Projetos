package org.example.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Traducao implements ITraducao{

    private TradutorEspanhol tradutorEspanhol;
    private TradutorIngles tradutorIngles;
    private TradutorItaliano tradutorItaliano;

    public void traduzir(String text) {
        String[] textoSeparado = text.split("[?,!|\s]");
        for (String aux: textoSeparado) {
            System.out.println(aux);
        }

    }


    public void addTradutor(TradutorItaliano tradutorItaliano) {

    }
    public void addTradutor(TradutorEspanhol tradutorEspanhol) {

    }
    public void addTradutor(TradutorIngles tradutorIngles) {

    }




}
