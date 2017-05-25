package comandadigital.com.br.comandadigital.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.adapter.ParticipanteAdapter;
import comandadigital.com.br.comandadigital.model.Cliente;
import comandadigital.com.br.comandadigital.model.Estabelecimento;

public class ParticipantesMesa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participantes);

        ListView listView = (ListView) findViewById(R.id.listParticipante);
        List<Cliente> clientes = genericList();

        ParticipanteAdapter adapter = new ParticipanteAdapter(clientes, this);

        listView.setAdapter(adapter);

    }

    public List <Cliente> genericList(){
        List<Cliente> list = new ArrayList();

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        c1.setNome("Pettão zika do baile");
        c2.setNome("Guizão mais zika ainda");

        list.add(c1);
        list.add(c2);

        return list;

    }
}
