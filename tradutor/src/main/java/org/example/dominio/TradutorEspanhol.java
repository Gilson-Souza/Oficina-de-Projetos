package org.example.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/**
 * Possivel solução criar um Hash Map com dois vetores um de palavras em espanhol e outro com as traduções
 * solicitar isso na interface, para todos os tradutores que implementam essa interface cumprirem esse contrato.
 * obs: a chave String palvrasEspanhol e a String palvrasTraduzidas devem estar na proporção chave para tradução
 * a palavra em espanhol é a chave e a palavra traduzida é referente ao conteudo armazenado por essa chave.
 */

public class TradutorEspanhol implements ITraducao {

    private String[] palavrasParaTraduzir;
    private String[] palavrasTraduzida;

    public TradutorEspanhol() {
        this.palavrasParaTraduzir = new String[]{"Hola","Buenos","Muy bien"};
        this.palavrasTraduzida = new String[]{};
    }

}

