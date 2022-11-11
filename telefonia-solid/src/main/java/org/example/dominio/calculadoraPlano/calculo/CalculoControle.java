package org.example.dominio.calculadoraPlano.calculo;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.Contrato;

@Getter
@Setter

public class CalculoControle extends Calcular{

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
              valorDDDFinal =  valorDDD * valorPadraoDDD;
        }

        int valorDDIgratis =  contrato.getPlano().getLigacaoDDIGratis();
        int valorDDI = 0;

        if (valorDDIgratis > contrato.getUso().getDdiEnviado()) {
            valorDDIFinal = 0;
        }else {
            valorDDI = contrato.getUso().getDdiEnviado() - valorDDIgratis;
            valorDDIFinal = valorDDI * valorPadraoDDI;
        }

        valorSMSFinal = contrato.getUso().getSmsEnviado() * valorPadraoSMS;

        valorDadosFinal = contrato.getUso().getDadosConsumidos() * valorPadraoInternet;

        return valorDDDFinal + valorDDIFinal + valorSMSFinal + valorDadosFinal;
    }

}
