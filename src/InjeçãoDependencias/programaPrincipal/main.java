package InjeçãoDependencias.programaPrincipal;

import InjeçãoDependencias.modelo.cliente;
import InjeçãoDependencias.notificacao.notificador;
import InjeçãoDependencias.notificacao.notificadorEmail;
import InjeçãoDependencias.notificacao.notificadorSMS;
import InjeçãoDependencias.service.AtivacaoCliente;

public class main {
    public static void main(String[] args) {
        cliente joao = new cliente("João", "joao@xyz.com", "999999999");
        cliente maria = new cliente("Maria", "mariaa@xyz.com", "888888888");

        notificador notificador = new notificadorSMS();

        AtivacaoCliente ativacaoCliente = new AtivacaoCliente(notificador);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }
}
