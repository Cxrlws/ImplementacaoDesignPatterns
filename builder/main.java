package builder;

import builder.pessoa.*;


public class main {
    public static void main(String[] args) {

        /* Utilização do Builder */
        
     Pessoa pessoa = new Pessoa.pessoaBuilder()
        .nome("Carlos")
        .idade(20)
        .função("Programador")
        .build();    
        
        System.out.println(pessoa.toString());

    }   
}
    
