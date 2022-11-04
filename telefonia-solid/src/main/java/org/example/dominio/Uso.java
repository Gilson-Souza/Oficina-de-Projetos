package org.example.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class Uso {


    private long id;

    private LocalDate data;
    private int smsEnviado;
    private int dddEnviado;
    private int ddiEnviado;
    private int dadosConsumidos;


    public void enviarSMS(Contrato contrato, int numero){this.smsEnviado = numero;}
    public void enviarDDD(Contrato contrato, int numero){
        this.dddEnviado = numero;
    }
    public void enviarDDI(Contrato contrato, int numero){
        this.ddiEnviado = numero;
    }
    public void consumirDados(Contrato contrato, int numero){
        this.dadosConsumidos = numero;
    }

    @Override
    public String toString() {
        return  "\nUso [ " + "\n" +
                "Sms enviados = " + smsEnviado + "\n" +
                "ligações DDD efetuadas = " + dddEnviado + "\n" +
                "ligações DDI efetuadas = " + ddiEnviado + "\n" +
                "Dados Consumidos = " + dadosConsumidos + "\n" +
                "]";
    }
}
