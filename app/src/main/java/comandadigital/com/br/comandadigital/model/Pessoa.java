package comandadigital.com.br.comandadigital.model;

import comandadigital.com.br.comandadigital.util.Sexo;

/**
 * Created by guilh on 21/05/2017.
 */

public class Pessoa {
    public String nome;
    public Sexo sexo;

    public void cadastrar(){}
    public void alterar(){}
    public void consultar(){}
    public void excluir(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
