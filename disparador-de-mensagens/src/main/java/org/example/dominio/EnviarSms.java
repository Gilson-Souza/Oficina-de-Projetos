package org.example.dominio;

public class EnviarSms implements IEnviar{




    @Override
    public void disparar(Conta conta) {

        System.out.println("Sms enviado para o destino");

    }


}
