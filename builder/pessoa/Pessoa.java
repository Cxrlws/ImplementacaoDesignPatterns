package builder.pessoa;

/* O builder nos permite que declaremos os atributos do construtor de uma classe de forma "livre", não sendo necessário
 * seguir um padrão de ordem ao declarar cada atributo.
 */

public class Pessoa {
    
    private String nome;
    private int idade;
    private String função;

    private Pessoa(String nome, int idade, String função){
        this.nome = nome;
        this.idade = idade;
        this.função = função;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFunção() {
        return função;
    }

    public void setFunção(String função) {
        this.função = função;
    }

   @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", função=" + função + "]";
    }


    public static class pessoaBuilder {

        private String nome;
        private int idade;
        private String função;
    
        public pessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
    
        public pessoaBuilder idade(int idade){
            this.idade = idade;
            return this;
        }
    
        public pessoaBuilder função(String função){
            this.função = função;
            return this;
        }
    
        public Pessoa build(){
            return new Pessoa(nome, idade, função);
        }
    
    }
}
