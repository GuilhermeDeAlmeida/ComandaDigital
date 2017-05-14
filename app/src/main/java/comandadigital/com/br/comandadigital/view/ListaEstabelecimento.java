package comandadigital.com.br.comandadigital.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.adapter.EstabelecimentoAdapter;
import comandadigital.com.br.comandadigital.model.Estabelecimento;

public class ListaEstabelecimento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estabelecimento);
        ListView listaEstabelecimentos = (ListView)findViewById(R.id.view_lista_estabelecimento);
        List<Estabelecimento> estabelecimentos = todosOsEstabelecimentos();
//        ArrayAdapter<Estabelecimento> adapter = new ArrayAdapter<Estabelecimento>(this,android.R.layout.simple_list_item_1, estabelecimentos);
//        listaEstabelecimentos.setAdapter(adapter);
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
