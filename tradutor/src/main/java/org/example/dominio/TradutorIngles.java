package org.example.dominio;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class TradutorIngles implements ITraducao{


    private String[] palavrasParaTraduzir = new String[]{};
    private String[] palavrasTraduzida = new String[]{};

    public TradutorIngles() {
        this.palavrasParaTraduzir = new String[]{};
        this.palavrasTraduzida = new String[]{};
    }
}

