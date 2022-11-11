package org.example.dominio.calculadoraPlano.calculo;

import lombok.Getter;
import lombok.Setter;
import org.example.dominio.calculadoraPlano.ICalcular;

@Getter
@Setter

public abstract class Calcular implements ICalcular {

    protected double valorPadraoSMS;
    protected double valorPadraoDDD;
    protected double valorPadraoDDI;
    protected double valorPadraoInternet;


}
