package comandadigital.com.br.comandadigital.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by guilh on 21/05/2017.
 */

public class ProdutoEstabelecimento extends Produto{

    private Long codigoEstabelecimento;
    /*private Long codigoProduto; */
    private BigDecimal preco;
    private int quantidade;

    public Long getCodigoEstabelecimento() {
        return codigoEstabelecimento;
    }

    public void setCodigoEstabelecimento(Long codigoEstabelecimento) {
        this.codigoEstabelecimento = codigoEstabelecimento;
    }

    /*public Long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }*/

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void cadastrarPreco(){

    }
    public void cadastrarEstoque(){

    }
}
