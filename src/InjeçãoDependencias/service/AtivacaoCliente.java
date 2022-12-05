package InjeçãoDependencias.service;

import InjeçãoDependencias.modelo.cliente;
import InjeçãoDependencias.notificacao.notificadorEmail;

public class AtivacaoCliente {

    public void ativar (cliente cliente) {
        cliente.ativar();
        notificadorEmail notificador = new notificadorEmail();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
