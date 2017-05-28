package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.adapter.ProdutoGridAdapter;
import comandadigital.com.br.comandadigital.adapter.ProdutoListaAdapter;
import comandadigital.com.br.comandadigital.model.ProdutoEstabelecimento;

/**
 * Created by Andressa on 20/05/2017.
 */

public class GridProdutos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_produtos);
        GridView listaProdutos = (GridView)findViewById(R.id.grid);
        List<ProdutoEstabelecimento> produtos = todosOsProdutos();
        ProdutoGridAdapter adapter = new ProdutoGridAdapter(produtos, this);
        listaProdutos.setAdapter(adapter);
        listaProdutos.setOnItemClickListener(new GridView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id){
                exibirProduto();
            }
        });
    }

    //método abaixo abre a tela de produto. Ainda não está sendo puxado em lugar nenhum
    public void exibirProduto(){
        Intent intent = new Intent(GridProdutos.this, DetalheProduto.class);
        startActivity(intent);
    }

    //only for test
    private List<ProdutoEstabelecimento> todosOsProdutos() {
        List<ProdutoEstabelecimento> list = new ArrayList<>();
        ProdutoEstabelecimento p1 = new ProdutoEstabelecimento();
        ProdutoEstabelecimento p2 = new ProdutoEstabelecimento();
        ProdutoEstabelecimento p3 = new ProdutoEstabelecimento();

        p1.setNome("Hambúrguer");
        p1.setPreco(new BigDecimal(29.9));

        p2.setNome("Salada");
        p2.setPreco(new BigDecimal(8.9));

        p3.setNome("Café");
        p3.setPreco(new BigDecimal(4.90));


        list.add(p1);
        list.add(p2);
        list.add(p3);

        return list;
    }
}
