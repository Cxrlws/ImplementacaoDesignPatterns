package prototype.solution;

import prototype.Botao;

public class TesteBotaoPrototype {
    public static void main(String[] args) {

        Botao botaoAmarelo = BotaoRegister.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);

        Botao botaoAzul = BotaoRegister.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);
    }
}
