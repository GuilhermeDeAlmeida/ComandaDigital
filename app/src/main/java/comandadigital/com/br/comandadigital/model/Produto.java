package comandadigital.com.br.comandadigital.model;

/**
 * Created by guilh on 21/05/2017.
 */

public class Produto {

    private Long codigo;
    private String nome;
    private String descricao;
    private String opcionais;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
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

    public void cadastrar(){}

    public void consultar(){}

    public void alterar(){}
}
