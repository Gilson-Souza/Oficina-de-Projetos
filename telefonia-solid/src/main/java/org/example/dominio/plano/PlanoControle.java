package org.example.dominio.plano;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.Contrato;

@Getter
@Setter

public class PlanoControle extends Plano {

    final static double VALOR_SMS = 0.12;
    final static double VALOR_DDD = 0.21;
    final static double VALOR_DDI = 0.33;
    final static double VALOR_INTERNET = 3.50;


    public PlanoControle(String nome, int ligacaoDDDGratis, int ligacaoDDIGratis) {
        super(nome, ligacaoDDDGratis, ligacaoDDIGratis);
        this.nome = nome;
        this.ligacaoDDDGratis = ligacaoDDDGratis;
        this.ligacaoDDIGratis = ligacaoDDIGratis;
    }

    @Override
    public double calcularConta(Contrato contrato){
        double valorDDDFinal = 0;
        double valorDDIFinal = 0;
        double valorSMSFinal = 0;
        double valorDadosFinal = 0;

        int valorDDDgratis = contrato.getPlano().getLigacaoDDDGratis();
        int valorDDD = 0;

        if (valorDDDgratis >= contrato.getUso().getDddEnviado()) {
            valorDDDFinal = 0;
        }else {
            valorDDD = contrato.getUso().getDddEnviado() - valorDDDgratis;
            valorDDDFinal =  valorDDD * VALOR_DDD;
        }

        int valorDDIgratis =  contrato.getPlano().getLigacaoDDIGratis();
        int valorDDI = 0;

        if (valorDDIgratis > contrato.getUso().getDdiEnviado()) {
            valorDDIFinal = 0;
        }else {
            valorDDI = contrato.getUso().getDdiEnviado() - valorDDIgratis;
            valorDDIFinal = valorDDI * VALOR_DDI;
        }

        valorSMSFinal = contrato.getUso().getSmsEnviado() * VALOR_SMS;

        valorDadosFinal = contrato.getUso().getDadosConsumidos() * VALOR_INTERNET;

        return valorDDDFinal + valorDDIFinal + valorSMSFinal + valorDadosFinal;
    }

}
