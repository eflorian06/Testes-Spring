package InjeçãoDependencias.service;

import InjeçãoDependencias.modelo.cliente;
import InjeçãoDependencias.modelo.produto;
import InjeçãoDependencias.notificacao.notificadorEmail;

public class emissaoNF {

        public void emitir(cliente cliente, produto produto) {
            //TODO: emitir nota fiscal

            notificadorEmail notificador = new notificadorEmail();
            notificador.notificar(cliente, "Sua nota fiscal foi emitida pata o produto " + produto.getNome());
        }
}
