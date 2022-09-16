package org.example.dominio;

public interface IEnviar {


     public void sacar(Cliente cliente, double valor);
     public void disparar(Cliente cliente);
     public void registrar(EnviarEmail acao);

}
