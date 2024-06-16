package prototype.solution;

import prototype.Botao;
import prototype.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegister {

    private static BotaoRegister botaoRegister;

    private static Map<String, Botao> register = new HashMap<>();

    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(30);
        botaoAmarelo.setLargura(60);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.GROSSA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(20);
        botaoAzul.setLargura(40);
        botaoAzul.setTipoBorda(TipoBordaEnum.FINA);

        register.put("BOTAO_AMARELO", botaoAmarelo);
        register.put("BOTAO_AZUL", botaoAzul);
    }

    public static BotaoRegister getInstance(){
        if(Objects.isNull(botaoRegister)){
            botaoRegister = new BotaoRegister();
            return botaoRegister;
        }
        return botaoRegister;
    }

    public static Botao getBotao(String key){
        return BotaoFactory.getInstance(register.get(key));
    }
}
