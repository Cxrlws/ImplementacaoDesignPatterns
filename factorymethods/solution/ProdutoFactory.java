package factorymethods.solution;

import factorymethods.*;


public class ProdutoFactory {
    
    public static Produto getInstance(TipoProdutoEnum tipoProduto){

        switch (tipoProduto) {
            case FISICO:
                Produto produtoFisico = new ProdutoFisico();
                produtoFisico.setDimensoes(true);
                return produtoFisico;

            case DIGITAL:
                Produto produtoDigital = new ProdutoDigital();
                produtoDigital.setDimensoes(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de produto não disponivel!");
        }
    }
}

