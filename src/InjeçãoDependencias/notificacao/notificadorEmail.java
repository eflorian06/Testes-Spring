package InjeçãoDependencias.notificacao;

import InjeçãoDependencias.modelo.cliente;

public class notificadorEmail implements notificador {
@Override
public void notificar(cliente cliente, String mensagem) {
    System.out.printf("Notificando %s através do e-mail %s: %s%n", cliente.getNome(), cliente.getEmail(), mensagem);
        }
}
