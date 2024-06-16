package factorymethods.solution;

import factorymethods.*;

/*
 * A Factory transfere a "Responsabilidade" de configuração de um objeto para si, onde anteriormente o cliente seria responsavel por
 * configurar o objeto. Observe que no teste problema, o cliente deve configurar se o produto possui ou não dimensoes fisicas, já 
 * no teste solução, através da utilização da factory, essa configuração é presetada de acordo com o tipo do produto escolhido.
 */

public class testeProdutoComFactory {
    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);

    }
}
