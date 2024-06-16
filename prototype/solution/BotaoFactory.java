package prototype.solution;

import prototype.Botao;

public class BotaoFactory {

    public static Botao getInstance(Botao prototyope){
        Botao clone = new Botao();
        clone.setAltura(prototyope.getAltura());
        clone.setCor(prototyope.getCor());
        clone.setTipoBorda(prototyope.getTipoBorda());
        clone.setLargura(prototyope.getLargura());
        return clone;
    }
}
