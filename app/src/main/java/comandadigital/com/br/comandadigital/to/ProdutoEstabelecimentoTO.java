package comandadigital.com.br.comandadigital.to;

import java.math.BigDecimal;

/**
 * Created by Andressa on 29/05/2017.
 */

public class ProdutoEstabelecimentoTO extends ProdutoTO{
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
}
