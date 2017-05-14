package comandadigital.com.br.comandadigital.model;

/**
 * Created by guilh on 09/05/2017.
 */

public class Estabelecimento {
    String nome;
    String endereço;
    String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
