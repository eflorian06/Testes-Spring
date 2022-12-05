package InjeçãoDependencias.notificacao;

import InjeçãoDependencias.modelo.cliente;

public class notificadorSMS implements notificador {
    @Override
    public void notificar(cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do SMS %s: %s%n", cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
