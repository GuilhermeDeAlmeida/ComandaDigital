package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import comandadigital.com.br.comandadigital.R;
import comandadigital.com.br.comandadigital.adapter.EstabelecimentoAdapter;
import comandadigital.com.br.comandadigital.adapter.MesaAdapter;
import comandadigital.com.br.comandadigital.model.Estabelecimento;
import comandadigital.com.br.comandadigital.model.Mesa;
import comandadigital.com.br.comandadigital.util.StatusMesa;

public class SelecaoMesa extends AppCompatActivity {

    private TextView mesaEQuantidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_mesa);

        Bundle extras = getIntent().getExtras();
        String codigoEstabelecimento = extras.getString("codigoEstabelecimento");

        final ListView listaMesas = (ListView)findViewById(R.id.listaDeMesas);
        List<Mesa> mesas = Mesa.obterMesasEstabelecimento(codigoEstabelecimento);

        final MesaAdapter adapter = new MesaAdapter(mesas, this);
        listaMesas.setAdapter(adapter);

        mesaEQuantidade = (TextView) findViewById(R.id.textViewMesaEQuantidade);



        listaMesas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Mesa mesaSelecionada = (Mesa)adapter.getItem(position);
                String numeroMesa = String.valueOf(mesaSelecionada.getCodigoMesa());
                String quantidadeMesa = String.valueOf(mesaSelecionada.getCapacidade());

                selecionarMesa(numeroMesa, quantidadeMesa);
            }
        });

    }

    private void selecionarMesa(String numeroMesa, String quantidade) {
        mesaEQuantidade.setText("Você selecionou a mesa " + numeroMesa + " para " + quantidade  + " pessoas");
    }

    public void reservarMesa(){
        Intent intent = new Intent(SelecaoMesa.this, ValidacaoMesaColaborador.class);
        startActivity(intent);
    }


}
