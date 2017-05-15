package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comandadigital.com.br.comandadigital.R;

public class SelecaoMesa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_mesa);
    }
    public void reservarMesa(){
        Intent intent = new Intent(SelecaoMesa.this, ValidacaoMesaColaborador.class);
        startActivity(intent);
    }
}
