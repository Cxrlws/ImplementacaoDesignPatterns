package proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

/*
 Utiliza-se cache em situações de busca visando uma melhor performance, onde se um ID ja foi consultado uma vez,
 na segunda consulta em diante as informações são retiradas do cache.
*/

public class PessoaRepositoryProxy extends PessoaRepository{

    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    /*Simulação de cache*/
    private Map<Long, Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada do metodo save...");
        super.save(pessoa);
        log.info("Chamada do metodo save finalizada.");
    }

    @Override
    public Pessoa findById(long id) {
        log.info("Chamada do metodo save findById...");
        if(!Objects.isNull(cache.get(id))){
            log.info("Retirando info do cache...");
            return cache.get(id);
        }
        Pessoa pessoa = super.findById(id);
        log.info("Chamada do metodo findById finalizada.");
        cache.put(id,pessoa);
        return pessoa;
    }
}
