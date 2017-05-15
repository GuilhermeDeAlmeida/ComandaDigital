package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comandadigital.com.br.comandadigital.R;

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
