package comandadigital.com.br.comandadigital.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.adapter.ProdutoAdapter;
import comandadigital.com.br.comandadigital.model.ProdutoEstabelecimento;

/**
 * Created by Andressa on 20/05/2017.
 */

public class ListaProdutos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
        ListView listaProdutos = (ListView)findViewById(R.id.lista_produtos);
        List<ProdutoEstabelecimento> produtos = todosOsProdutos();
        ProdutoAdapter adapter = new ProdutoAdapter(produtos, this);
        listaProdutos.setAdapter(adapter);
    }

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
