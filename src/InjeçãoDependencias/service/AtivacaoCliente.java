package InjeçãoDependencias.service;

import InjeçãoDependencias.modelo.cliente;
import InjeçãoDependencias.notificacao.notificador;
import InjeçãoDependencias.notificacao.notificadorEmail;

public class AtivacaoCliente {
    private InjeçãoDependencias.notificacao.notificador notificador;

    public AtivacaoCliente(notificador notificador) {
        this.notificador = notificador;
    }
    public void ativar (cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
