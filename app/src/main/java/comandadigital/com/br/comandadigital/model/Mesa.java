package comandadigital.com.br.comandadigital.model;

import java.util.ArrayList;
import java.util.List;

import comandadigital.com.br.comandadigital.util.StatusMesa;

/**
 * Created by guilh on 21/05/2017.
 */

public class Mesa {
    private int capacidade;
    private int codigoMesa;
    private String finalidade;
    private StatusMesa status;

    public void selecionarMesa(){}
    public void liberarMesa(){}
    public void avisarTerminoReserva(){}

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Long getCodigoMesa() {
        return codigoMesa;
    }

    public void setCodigoMesa(Long codigoMesa) {
        this.codigoMesa = codigoMesa;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public StatusMesa getStatus() {
        return status;
    }

    public void setStatus(StatusMesa status) {
        this.status = status;
    }

    /**
     * Método que populará as mesas dentro do estabelecimento a partir do codigo do mesmo
     */
    public static List<Mesa> obterMesasEstabelecimento(String codigoEstabelecimento){
        List<Mesa> list1 = listaMesaGenerica1();
        List<Mesa> list2 = listaMesaGenerica2();
        List<Mesa> list3 = listaMesaGenerica3();
        List<Mesa> list4 = listaMesaGenerica4();

        if(codigoEstabelecimento.equals("001ABCDGUILHERMEDAORA")){
            return list1;
        }else if(codigoEstabelecimento.equals("002ABCDGUILHERMEDAORA")){
            return list2;
        }else if(codigoEstabelecimento.equals("003ABCDGUILHERMEDAORA")){
            return list3;
        }else
            return list4;
    }

    private static List<Mesa> listaMesaGenerica1(){

        Mesa m1 = new Mesa();
        m1.setStatus(StatusMesa.Livre);
        m1.setFinalidade("Livre para curitir como quiser");
        m1.setCodigoMesa(1L);
        m1.setCapacidade(4);

        Mesa m2 = new Mesa();
        m2.setStatus(StatusMesa.Livre);
        m2.setFinalidade("Livre para curitir como quiser");
        m2.setCodigoMesa(2L);
        m2.setCapacidade(6);

        Mesa m3 = new Mesa();
        m3.setStatus(StatusMesa.Livre);
        m3.setFinalidade("Para o conforto de sua Familia");
        m3.setCodigoMesa(3L);
        m3.setCapacidade(8);

        Mesa m4 = new Mesa();
        m4.setStatus(StatusMesa.Livre);
        m4.setFinalidade("Para curtir com os Amigos");
        m4.setCodigoMesa(4L);
        m4.setCapacidade(10);

        List<Mesa> list = new ArrayList<>();

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        return list;
    }
    private static List<Mesa> listaMesaGenerica2(){

        Mesa m1 = new Mesa();
        m1.setStatus(StatusMesa.AguardandoValidacao);
        m1.setFinalidade("Livre");
        m1.setCodigoMesa(1L);
        m1.setCapacidade(4);

        Mesa m2 = new Mesa();
        m2.setStatus(StatusMesa.Livre);
        m2.setFinalidade("Livre");
        m2.setCodigoMesa(2L);
        m2.setCapacidade(6);

        Mesa m3 = new Mesa();
        m3.setStatus(StatusMesa.Livre);
        m3.setFinalidade("Familia");
        m3.setCodigoMesa(3L);
        m3.setCapacidade(8);

        Mesa m4 = new Mesa();
        m4.setStatus(StatusMesa.Ocupada);
        m4.setFinalidade("Amigos");
        m4.setCodigoMesa(4L);
        m4.setCapacidade(10);

        List<Mesa> list = new ArrayList<>();

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        return list;
    }

    private static List<Mesa> listaMesaGenerica3(){

        Mesa m1 = new Mesa();
        m1.setStatus(StatusMesa.AguardandoValidacao);
        m1.setFinalidade("Livre");
        m1.setCodigoMesa(1L);
        m1.setCapacidade(4);

        Mesa m2 = new Mesa();
        m2.setStatus(StatusMesa.AguardandoValidacao);
        m2.setFinalidade("Livre");
        m2.setCodigoMesa(2L);
        m2.setCapacidade(6);

        Mesa m3 = new Mesa();
        m3.setStatus(StatusMesa.AguardandoValidacao);
        m3.setFinalidade("Familia");
        m3.setCodigoMesa(3L);
        m3.setCapacidade(8);

        Mesa m4 = new Mesa();
        m4.setStatus(StatusMesa.AguardandoValidacao);
        m4.setFinalidade("Amigos");
        m4.setCodigoMesa(4L);
        m4.setCapacidade(10);

        List<Mesa> list = new ArrayList<>();

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        return list;
    }

    private static List<Mesa> listaMesaGenerica4(){

        Mesa m1 = new Mesa();
        m1.setStatus(StatusMesa.Ocupada);
        m1.setFinalidade("Livre");
        m1.setCodigoMesa(1L);
        m1.setCapacidade(4);

        Mesa m2 = new Mesa();
        m2.setStatus(StatusMesa.Ocupada);
        m2.setFinalidade("Livre");
        m2.setCodigoMesa(2L);
        m2.setCapacidade(6);

        Mesa m3 = new Mesa();
        m3.setStatus(StatusMesa.Ocupada);
        m3.setFinalidade("Familia");
        m3.setCodigoMesa(3L);
        m3.setCapacidade(8);

        Mesa m4 = new Mesa();
        m4.setStatus(StatusMesa.Ocupada);
        m4.setFinalidade("Amigos");
        m4.setCodigoMesa(4L);
        m4.setCapacidade(10);

        List<Mesa> list = new ArrayList<>();

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        return list;
    }
}
