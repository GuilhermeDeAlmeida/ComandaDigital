package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comandadigital.com.br.comandadigital.R;

/*
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListaEstabelecimento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estabelecimento);
        ListView listaEstabelecimentos = (ListView)findViewById(R.id.view_lista_estabelecimento);
        List<Estabelecimento> estabelecimentos = todosOsEstabelecimentos();
        EstabelecimentoAdapter adapter = new EstabelecimentoAdapter(estabelecimentos, this);
        listaEstabelecimentos.setAdapter(adapter);
    }

    private List<Estabelecimento> todosOsEstabelecimentos() {
        List<Estabelecimento> list = new ArrayList<>();
        Estabelecimento e1 = new Estabelecimento();
        Estabelecimento e2 = new Estabelecimento();
        Estabelecimento e3 = new Estabelecimento();
        Estabelecimento e4 = new Estabelecimento();
        e1.setEndereço("Rua dos loco");
        e1.setNome("Lojinha");
        e1.setTelefone("(11)4355-9665");

        e2.setEndereço("Rua dos normal");
        e2.setNome("Lojona");
        e2.setTelefone("(11)4355-9666");

        e3.setEndereço("Rua dos mais ou menos");
        e3.setNome("Lojoaria");
        e3.setTelefone("(11)4355-9667");

        e4.setEndereço("Rua dos mais normais");
        e4.setNome("Lojeiro");
        e4.setTelefone("(11)4355-9668");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        return list;
    }

}

 */


public class SelecaoPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
    }

    public void visualizarDetalhesProduto(){
        Intent intent = new Intent(SelecaoPedido.this, DetalheProduto.class);
        startActivity(intent);
    }

    public void confirmarPedido(){
        Intent intent = new Intent(SelecaoPedido.this, DetalhePedido.class);
        startActivity(intent);
    }


}
