package prototype.problem;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {

    public BotaoAmarelo(){
        setCor("Amarelo");
        setAltura(30);
        setLargura(60);
        setTipoBorda(TipoBordaEnum.GROSSA);
    }
}
