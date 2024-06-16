package factorymethods.problem;

import factorymethods.ProdutoDigital;
import factorymethods.ProdutoFisico;

/* Percebe-se que sem a factory, é necessario a especificação das dimensões por parte do cliente */

public class testeProduto {
    public static void main(String[] args) {

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setDimensoes(true); 

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setDimensoes(false);

        
        
    }
    
}
