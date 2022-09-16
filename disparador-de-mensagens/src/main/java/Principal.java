import org.example.dominio.Cliente;
import org.example.dominio.EnviarEmail;
import org.example.dominio.IEnviar;

public class Principal {

    public static void main(String[] args) {


        //Conta conta = new Conta("245006-8", 2500);
        Cliente cliente = new Cliente("Gilson C Souza", "947799976");
        IEnviar enviarEmail = new EnviarEmail();

        enviarEmail.sacar(cliente,500);

    }

}