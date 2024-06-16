package factorymethods;

import java.math.BigDecimal;

public class Produto {
    private String descricao;
    private BigDecimal preco;
    private Boolean dimensoes;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getPreco() {
        return preco;
    }
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    public Boolean getDimensoes() {
        return dimensoes;
    }
    public void setDimensoes(Boolean dimensoes) {
        this.dimensoes = dimensoes;
    }
    @Override
    public String toString() {
        return "Produto [descricao=" + descricao + ", preco=" + preco + ", dimensoes=" + dimensoes + "]";
    }

    
}
