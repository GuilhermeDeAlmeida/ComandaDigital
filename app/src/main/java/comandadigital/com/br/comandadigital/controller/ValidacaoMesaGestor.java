package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comandadigital.com.br.comandadigital.R;

public class ValidacaoMesaGestor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacao_mesa_gestor);
    }
    public void validar(){
        Intent intent = new Intent(ValidacaoMesaGestor.this, SelecaoPedido.class);
        startActivity(intent);
    }
}
