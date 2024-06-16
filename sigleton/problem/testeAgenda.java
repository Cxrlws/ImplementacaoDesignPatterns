package sigleton.problem;

/*
 * Percebe-se que o objetivo do nosso metodo reservaDia é ocupar os dias disponiveis de nossa semana, porém
 * observamos que a cada chamada do metódo, uma nova agenda é criada, ou seja, nos impossibilitando de ocupar
 * multiplos dias em uma mesma agenda.  
 */

public class testeAgenda {
    public static void main(String[] args) {
        reservaDia("Sexta");
        reservaDia("Sabado");
    }

    public static void reservaDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());

    }
}
