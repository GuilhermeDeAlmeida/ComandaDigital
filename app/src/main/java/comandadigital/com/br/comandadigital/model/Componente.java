package comandadigital.com.br.comandadigital.model;

/**
 * Created by Andressa on 03/09/2017.
 */

public class Componente {
    private int codigoComponente;
    private String nome;
    private boolean status;

    public Componente(int codigoComponente, String nome, boolean status) {

        this.codigoComponente = codigoComponente;
        this.nome = nome;
        this.status = status;
    }

    public int getCodigoComponente() {
        return codigoComponente;
    }

    public void setCodigoComponente(int codigoComponente) {
        this.codigoComponente = codigoComponente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
