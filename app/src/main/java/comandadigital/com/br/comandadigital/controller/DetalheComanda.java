package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comandadigital.com.br.comandadigital.R;

public class DetalheComanda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comanda);
    }
    public void efetuarPagamento(){
        Intent intent = new Intent(DetalheComanda.this, SelecaoPagamento.class);
        startActivity(intent);
    }
}
