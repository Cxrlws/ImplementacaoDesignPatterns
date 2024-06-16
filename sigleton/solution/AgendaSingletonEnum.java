package sigleton.solution;

import java.util.HashMap;
import java.util.Map;

/*
 * O pattern singleton nos permite a utilização de uma unica instância, possibilitando por exemplo, a ocupação de multiplos dias
 * em nossa agenda, o que era impossivel anteriormente utilizando o metodo convencional em nosso código problema. 
 * 
 * 2ª Enum
 * Evita reflection (acesso de contrutores privados por meio do class.getDeclaretedConstructor)
 */

public enum AgendaSingletonEnum {


    INSTANCE;

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonEnum(){
        diasDisponiveis.put("Domingo", true);
        diasDisponiveis.put("Segunda", true);
        diasDisponiveis.put("Terça", true);
        diasDisponiveis.put("Quarta", true);
        diasDisponiveis.put("Quinta", true);
        diasDisponiveis.put("Sexta", true);
        diasDisponiveis.put("Sabado", true);
    }

    public static AgendaSingletonEnum getInstance(){
        return INSTANCE;
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupa(String dia){
        diasDisponiveis.replace(dia, false);
    }

}
