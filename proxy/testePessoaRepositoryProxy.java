package proxy;

/*
    Proxy é muito utilizado na questão dos Logs, por exemplo. Quando não se pode alterar nada na classe
    no entanto é necessario loggar, cria-se então um proxy no caminho.
 */
public class testePessoaRepositoryProxy {
    public static void main(String[] args) {
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        Pessoa pessoa = new Pessoa("Carlos",20);

        pessoaRepositoryProxy.save(pessoa);
        System.out.println(pessoa.toString());
    }
}
