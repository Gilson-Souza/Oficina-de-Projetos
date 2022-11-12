package org.example.dominio.calculadoraPlano.calculo;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.Contrato;
import org.example.dominio.LinhaTelefonica;
import org.example.dominio.criarPlano.IPlano;
import org.example.dominio.criarPlano.plano.Plano;

@Getter
@Setter

public class CalculoControle extends Calcular{


    public double calcularConta(LinhaTelefonica linhaTelefonica){

        double valorDDDFinal = 0;
        double valorDDIFinal = 0;
        double valorSMSFinal = 0;
        double valorDadosFinal = 0;


        int valorDDDgratis = linhaTelefonica.getPlano().getLigacaoDDDGratis();
        int valorDDD = 0;

        if (valorDDDgratis >= linhaTelefonica.getUso().getDddEnviado()) {
            valorDDDFinal = 0;
        }else {
              valorDDD = linhaTelefonica.getUso().getDddEnviado() - valorDDDgratis;
              valorDDDFinal =  valorDDD * valorPadraoDDD;
        }

        int valorDDIgratis = linhaTelefonica.getPlano().getLigacaoDDIGratis();
        int valorDDI = 0;

        if (valorDDIgratis > linhaTelefonica.getUso().getDdiEnviado()) {
            valorDDIFinal = 0;
        }else {
            valorDDI = linhaTelefonica.getUso().getDdiEnviado() - valorDDIgratis;
            valorDDIFinal = valorDDI * valorPadraoDDI;
        }

        valorSMSFinal = linhaTelefonica.getUso().getSmsEnviado() * valorPadraoSMS;

        valorDadosFinal = linhaTelefonica.getUso().getDadosConsumidos() * valorPadraoInternet;

        return valorDDDFinal + valorDDIFinal + valorSMSFinal + valorDadosFinal;
    }

}
