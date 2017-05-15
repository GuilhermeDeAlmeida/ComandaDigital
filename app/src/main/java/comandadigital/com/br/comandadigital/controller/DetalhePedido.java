package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comandadigital.com.br.comandadigital.R;

public class DetalhePedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pedido);
    }
    public void confirmarPedido(){
        Intent intent = new Intent(DetalhePedido.this, DetalheComanda.class);
        startActivity(intent);
    }
}
