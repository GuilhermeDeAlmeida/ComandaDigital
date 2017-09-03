package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.adapter.ProdutoGridAdapter;
import comandadigital.com.br.comandadigital.model.Produto;

/**
 * Created by Andressa on 20/05/2017.
 */

public class GridProdutos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_produtos);
        GridView listaProdutos = (GridView)findViewById(R.id.grid);
        List<Produto> produtos = todosOsProdutos();
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
    private List<Produto> todosOsProdutos() {
        List<Produto> list = new ArrayList<>();
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.setCodigo(1);
        p1.setNome("Hambúrguer Especial");
        p1.setPreco(29.95);

        p2.setCodigo(2);
        p2.setNome("Salada");
        p2.setPreco(8.98);

        p3.setCodigo(3);
        p3.setNome("Café expresso");
        p3.setPreco(4.98);


        list.add(p1);
        list.add(p2);
        list.add(p3);

        return list;
    }
}
