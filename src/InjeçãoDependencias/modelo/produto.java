package InjeçãoDependencias.modelo;

import java.math.BigDecimal;

public class produto {

    private String nome;
    private BigDecimal valTotal;

    public produto(String nome, BigDecimal valTotal) {
        super();
        this.nome = nome;
        this.valTotal = valTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValTotal() {
        return valTotal;
    }

    public void setValTotal(BigDecimal valTotal) {
        this.valTotal = valTotal;
    }
}
