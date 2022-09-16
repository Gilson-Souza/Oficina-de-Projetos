package org.example.dominio;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class EnviarEmail implements IEnviar {


    @Override
    public void sacar(Cliente cliente, double valor) {
        double saque = 0;
        cliente.valorInicial();
        saque = cliente.getConta().getSaldoCorrente() - valor;
        cliente.valorSacado();
        cliente.contaAtualizada();
        disparar(cliente);

    }
    @Override
    public void disparar(Cliente cliente) {

        String meuEmail = "gilsonpro10@gmail.com";
        String minhaSenha = "Itachi10%22*";

        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
        email.setSSLOnConnect(true);

        try {
            email.setFrom(meuEmail);
            email.setSubject("Aviso de acao bancaria");
            email.setMsg("Foi realizado um saque no valor de: " + cliente.valorSacado() +
                         "O valor anterior ao saque era de:  " + cliente.valorInicial() +
                         "O atual valor permacente na sua conta é de:" + cliente.contaAtualizada()
                         );
            email.addTo(cliente.getEmail());
            email.send();
            System.out.println("Email enviado com sucesso");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void registrar(EnviarEmail acao) {
    }


}
