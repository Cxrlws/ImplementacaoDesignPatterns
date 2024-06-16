package prototype.problem;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoAzul extends Botao{
    
    public BotaoAzul(){
        setCor("Azul");
        setAltura(20);
        setLargura(40);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
