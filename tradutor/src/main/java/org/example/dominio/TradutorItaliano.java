package org.example.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TradutorItaliano implements ITraducao{


    private String[] palavrasParaTraduzir;
    private String[] palavrasTraduzida;

    public TradutorItaliano() {
        this.palavrasParaTraduzir = new String[]{};
        this.palavrasTraduzida = new String[]{};
    }
}
