package sigleton.solution;

/*
 * Percebe-se que desta vez, ao chamarmos o metodo pela primeira vez, a sexta é ocupada, e ao chamarmos novamente o 
 * método reservaDiaEG, o sábado também é ocupado sem alterar os outro dias, ou seja, apenas uma instancia é trabalhada na memória
 */

public class testeAgendaSingleton {
    public static void main(String[] args) {
        reservaDiaEG("Sexta");
        reservaDiaEG("Sabado");
    }

    public static void reservaDiaEG(String dia){
        AgendaSingletonEG agenda = AgendaSingletonEG.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());

    }
}
