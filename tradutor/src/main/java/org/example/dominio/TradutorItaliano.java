package org.example.dominio;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter

public class TradutorItaliano implements ITraducao{
    private Set<String> palavras;

    @Override
    public void traduzir(String texto) {
        String[] textoSeparado = texto.split("[?,!|\s]");
        for (String aux: textoSeparado) {
            System.out.println(aux);
        }
        for (int i = 0; i < palavras.size(); i++) {
            if (!getPalavras().equals(textoSeparado)){

            }else{

            }

        }
    }


}
