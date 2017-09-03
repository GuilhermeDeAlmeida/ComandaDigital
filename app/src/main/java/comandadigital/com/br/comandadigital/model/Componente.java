package comandadigital.com.br.comandadigital.model;

/**
 * Created by Andressa on 03/09/2017.
 */

public class Componente {
    private int idComponente;
    private String nome;
    private boolean status;

    public Componente(int idComponente, String nome, boolean status) {

        this.idComponente = idComponente;
        this.nome = nome;
        this.status = status;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
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
