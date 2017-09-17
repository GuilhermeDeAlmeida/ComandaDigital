package comandadigital.com.br.comandadigital.model;

import java.util.Date;

import comandadigital.com.br.comandadigital.util.CargoColaborador;

/**
 * Created by guilh on 21/05/2017.
 */

public class Colaborador extends Pessoa{
    private int codigoColaborador;
    private String cpf;
    private CargoColaborador cargo;
    private String jornada;
    private Date entrada;
    private Date saida;

    public void cadastrarColaborador(){}
    public void alterarColaborador(){}
    public void listarColaboradores(){}

}
