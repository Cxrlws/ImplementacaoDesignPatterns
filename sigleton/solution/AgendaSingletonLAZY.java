package sigleton.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 * O pattern singleton nos permite a utilização de uma unica instância, possibilitando por exemplo, a ocupação de multiplos dias
 * em nossa agenda, o que era impossivel anteriormente utilizando o metodo convencional em nosso código problema. 
 * 
 * 2ª Forma de singleton - LAZY
 * Sempre que o getInstance for chamado, verifica-se a instancia (se é nula ou não), caso seja nula, um novo objeto é instanciado,
 * caso contrário, o objeto ja existente é retornado. 
 * Percebe-se que o objeto so é instanciado se o getInstance for chamado, ou seja, diferentemente do EAGER, o objeto não é instanciado
 * de primeira, evitando assim uma ocupação desnecessária de memória.
 */

public class AgendaSingletonLAZY {


    private static AgendaSingletonLAZY INSTANCE = null;

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    public AgendaSingletonLAZY(){
        diasDisponiveis.put("Domingo", true);
        diasDisponiveis.put("Segunda", true);
        diasDisponiveis.put("Terça", true);
        diasDisponiveis.put("Quarta", true);
        diasDisponiveis.put("Quinta", true);
        diasDisponiveis.put("Sexta", true);
        diasDisponiveis.put("Sabado", true);
    }

    public static AgendaSingletonLAZY getInstance(){
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new AgendaSingletonLAZY();
            return INSTANCE;
        }
        return INSTANCE;
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupa(String dia){
        diasDisponiveis.replace(dia, false);
    }

}
