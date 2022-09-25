package org.example.dominio;



public class EnviarEmail implements IEnviar {


    @Override
    public void disparar(Conta conta) {

        System.out.println("Email enviado para o destino");
        System.out.println("O atual valor na sua conta é de:" + conta.contaAtualizada());
        System.out.println();
    /*

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
            email.setMsg("Foi realizado um saque no valor de: " + conta.valorSacado() +
                         "O valor anterior ao saque era de:  " + conta.valorInicial() +
                         "O atual valor permacente na sua conta é de:" + conta.contaAtualizada()
                         );
            email.addTo(cliente.getEmail());
            email.send();
            System.out.println("Email enviado com sucesso");
        } catch (Exception e){
            e.printStackTrace();
        }

     */
    }

}
