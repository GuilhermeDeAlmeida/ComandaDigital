package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.adapter.EstabelecimentoAdapter;
import comandadigital.com.br.comandadigital.model.Estabelecimento;
import comandadigital.com.br.comandadigital.model.Mesa;
import comandadigital.com.br.comandadigital.util.StatusMesa;

public class SelecaoEstabelecimento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_estabelecimento);

        ListView listaEstabelecimentos = (ListView)findViewById(R.id.lista_de_estabelecimento);
        List<Estabelecimento> estabelecimentos = todosOsEstabelecimentos();

        final EstabelecimentoAdapter adapter = new EstabelecimentoAdapter(estabelecimentos, this);
        listaEstabelecimentos.setAdapter(adapter);
        listaEstabelecimentos.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Estabelecimento estab = (Estabelecimento) adapter.getItem(position);
                String codigoEstabelecimento = estab.getCodigo();
                exibirMesasEstabelecimentos(codigoEstabelecimento);
            }

        });

    }
    public void exibirMesasEstabelecimentos(String codigoEstabelecimento){
        Intent intent = new Intent(SelecaoEstabelecimento.this, SelecaoMesa.class);
        intent.putExtra("codigoEstabelecimento",codigoEstabelecimento);

        startActivity(intent);
    }
    private List<Estabelecimento> todosOsEstabelecimentos() {
        List<Estabelecimento> list = new ArrayList<>();

        Estabelecimento e1 = new Estabelecimento();
        Estabelecimento e2 = new Estabelecimento();
        Estabelecimento e3 = new Estabelecimento();
        Estabelecimento e4 = new Estabelecimento();
        e1.setCodigo("001ABCDGUILHERMEDAORA");
        e1.setHorarioAbertura("18:30");
        e1.setHorarioFechamento("23:30");
        e1.setLatitude("");
        e1.setLongitude("");
        e1.setLocalizacao("Rua da Facul, 123");
        e1.setNome("Guizão Daoras BAR");

        e2.setCodigo("002ABCDGUILHERMEDAORA");
        e2.setHorarioAbertura("8:30");
        e2.setHorarioFechamento("18:30");
        e2.setLatitude("");
        e2.setLongitude("");
        e2.setNome("Petão do MAL");
        e2.setLocalizacao("Rua dos diademas, 222");

        e3.setCodigo("003ABCDGUILHERMEDAORA");
        e3.setHorarioAbertura("18:30");
        e3.setHorarioFechamento("03:30");
        e3.setLatitude("");
        e3.setLongitude("");
        e3.setLocalizacao("Avenida do perigo, 321");
        e3.setNome("Enrico troxa");

        e4.setCodigo("004ABCDGUILHERMEDAORA");
        e4.setHorarioAbertura("18:30");
        e4.setHorarioFechamento("23:30");
        e4.setLatitude("");
        e4.setLongitude("");
        e4.setLocalizacao("São Matheus só por Deus, 554 ");
        e4.setNome("Dessa a unica responsavel");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        return list;
    }



}
