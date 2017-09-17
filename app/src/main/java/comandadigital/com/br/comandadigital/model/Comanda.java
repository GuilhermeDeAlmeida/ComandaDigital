package comandadigital.com.br.comandadigital.model;

import java.math.BigDecimal;
import java.util.Date;

import comandadigital.com.br.comandadigital.util.StatusComanda;

/**
 * Created by guilh on 21/05/2017.
 */

public class Comanda {
    private Long codigoComanda;
    private Date dataHoraAbertura;
    private Date dataHoraFechamento;
    private BigDecimal total;
    private StatusComanda status;

    public void encerrar(){}

    public void consultar(){}

}
