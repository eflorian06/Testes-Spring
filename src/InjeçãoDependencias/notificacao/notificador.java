package InjeçãoDependencias.notificacao;

import InjeçãoDependencias.modelo.cliente;

public interface notificador {
    void notificar(cliente cliente, String mensagem);
}

