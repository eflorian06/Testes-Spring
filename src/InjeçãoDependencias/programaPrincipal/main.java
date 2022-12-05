package InjeçãoDependencias.programaPrincipal;

import InjeçãoDependencias.modelo.cliente;
import InjeçãoDependencias.service.AtivacaoCliente;

public class main {
    public static void main(String[] args) {
        cliente joao = new cliente("João", "joao@xyz.com", "999999999");
        cliente maria = new cliente("Maria", "mariaa@xyz.com", "888888888");

        AtivacaoCliente ativacaoCliente = new AtivacaoCliente();
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }
}
