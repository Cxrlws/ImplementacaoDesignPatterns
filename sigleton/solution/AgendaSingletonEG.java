package sigleton.solution;

import java.util.HashMap;
import java.util.Map;

/*
 * O pattern singleton nos permite a utilização de uma unica instância, possibilitando por exemplo, a ocupação de multiplos dias
 * em nossa agenda, o que era impossivel anteriormente utilizando o metodo convencional em nosso código problema. 
 * 
 * 1ª Forma de singleton - EAGER
 * Static pois desejamos utilizar apenas uma instancia deste objeto e final pois o mesmo não irá ser modificado.
 * Ao utilizarmos o getInstance, uma unica instancia será trabalhada.
 */

public class AgendaSingletonEG {

    /*Static pois desejamos apenas uma instancia deste objeto e final pois o mesmo não irá ser modificado.
     * Ao utilizarmos o getInstance, uma unica instancia será trabalhada.
     */
    private static final AgendaSingletonEG INSTANCE = new AgendaSingletonEG();

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    public AgendaSingletonEG(){
        diasDisponiveis.put("Domingo", true);
        diasDisponiveis.put("Segunda", true);
        diasDisponiveis.put("Terça", true);
        diasDisponiveis.put("Quarta", true);
        diasDisponiveis.put("Quinta", true);
        diasDisponiveis.put("Sexta", true);
        diasDisponiveis.put("Sabado", true);
    }

    public static AgendaSingletonEG getInstance(){
        return INSTANCE;
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupa(String dia){
        diasDisponiveis.replace(dia, false);
    }

}
