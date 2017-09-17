package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.adapter.ProdutoDetalheAdapter;
import comandadigital.com.br.comandadigital.adapter.ProdutoGridAdapter;
import comandadigital.com.br.comandadigital.model.Componente;
import comandadigital.com.br.comandadigital.model.Produto;

import static comandadigital.com.br.comandadigital.R.layout.lista_item_opcional;
import static comandadigital.com.br.comandadigital.R.mipmap.indifferent;

public class DetalheProduto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        ListView listaComponentes = (ListView) findViewById(R.id.lista_opcionais);
        List<Componente> componentes = todosOsComponentes();
        ProdutoDetalheAdapter adapter = new ProdutoDetalheAdapter(componentes, this);
        listaComponentes.setAdapter(adapter);
    }

        //only for test
    private List<Componente> todosOsComponentes() {
        List<Componente> list = new ArrayList<>();
        Componente c1 = new Componente(1, "Cebola", true);
        Componente c2 = new Componente(2, "Alface", true);
        Componente c3 = new Componente(3, "Tomate", true);

        list.add(c1);
        list.add(c2);
        list.add(c3);

        return list;
    }
}
