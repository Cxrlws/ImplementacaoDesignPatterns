package sigleton.solution;

/*
 * Percebe-se que desta vez, ao chamarmos o metodo pela primeira vez, a sexta é ocupada, e ao chamarmos novamente o 
 * método reservaDia, o sábado também é ocupado sem alterar os outro dias, ou seja, apenas uma instancia é trabalhada na memória
 */

public class testeAgendaSingletonLAZY {
    public static void main(String[] args) {
        reservaDiaLAZY("Sexta");
        reservaDiaLAZY("Sabado");
    }

    public static void reservaDiaLAZY(String dia){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());

    }
}
