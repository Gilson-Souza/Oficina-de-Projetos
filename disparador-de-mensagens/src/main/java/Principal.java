import org.example.dominio.*;

public class Principal {

    public static void main(String[] args) {


        //Conta conta = new Conta("245006-8", 2500);
        Cliente cliente = new Cliente("Gilson C Souza", "947799976");
        Conta conta = new Conta("12345-1", 2500, cliente);
        EnviarEmail enviarEmail = new EnviarEmail();
        EnviarWaths enviarWhats = new EnviarWaths();
        EnviarSms enviarSms = new EnviarSms();

        conta.sacar(500);
        conta.sacar(250.50);
        conta.sacar(5);
        conta.sacar(32.60);

        enviarEmail.disparar(conta);
        enviarWhats.disparar(conta);
        enviarSms.disparar(conta);


    }

}