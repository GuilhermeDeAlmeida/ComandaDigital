package comandadigital.com.br.comandadigital.model;

import java.util.Date;

import comandadigital.com.br.comandadigital.util.CargoColaborador;

/**
 * Created by guilh on 21/05/2017.
 */

public class Colaborador extends Pessoa{
    private String cpf;
    private CargoColaborador cargo;
    private String jornada;
    private Date entrada;
    private Date saida;
    public void validarMesa(){}
    public void validarPedido(){}
}
