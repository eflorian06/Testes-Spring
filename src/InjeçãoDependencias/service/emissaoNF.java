package InjeçãoDependencias.service;

import InjeçãoDependencias.modelo.cliente;
import InjeçãoDependencias.modelo.produto;
import InjeçãoDependencias.notificacao.notificador;
import InjeçãoDependencias.notificacao.notificadorEmail;

public class emissaoNF {

        private InjeçãoDependencias.notificacao.notificador notificador;

        public emissaoNF(notificador notificador) {
            this.notificador = notificador;
        }
        public void emitir(cliente cliente, produto produto) {
            //TODO: emitir nota fiscal

            this.notificador.notificar(cliente, "Sua nota fiscal foi emitida pata o produto " + produto.getNome());
        }
}
