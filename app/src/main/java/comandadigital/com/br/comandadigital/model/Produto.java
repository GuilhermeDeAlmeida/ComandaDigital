package comandadigital.com.br.comandadigital.model;

import java.util.List;

/**
 * Created by guilh on 21/05/2017.
 */

public class Produto {

    private int codigoProduto;
    private String nome;
    private String descricao;
    private String opcionais;
    private List<Componente> componentes;
    private double preco;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void cadastrar(){}

    public void consultar(){}

    public void alterar(){}
}
