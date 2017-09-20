package comandadigital.com.br.comandadigital.model;

import java.util.List;

/**
 * Created by guilh on 09/05/2017.
 */

public class Estabelecimento {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String latitude;
    private String longitude;
    private String codigo;
    private String localizacao;
    private String horarioAbertura;
    private String horarioFechamento;
    private List<Mesa> mesas;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCodigo() {

        return codigo;
    }

    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }

    public String getHorarioAbertura()
    {
        return horarioAbertura;
    }

    public void setHorarioAbertura(String horarioAbertura) {
        this.horarioAbertura = horarioAbertura;
    }

    public String getHorarioFechamento() {

        return horarioFechamento;
    }

    public void setHorarioFechamento(String horarioFechamento) {

        this.horarioFechamento = horarioFechamento;
    }

    public String getLocalizacao() {

        return localizacao;
    }

    public void setLocalizacao(String localizacao) {

        this.localizacao = localizacao;
    }


    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }
}
