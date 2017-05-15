package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comandadigital.com.br.comandadigital.R;

public class ValidacaoMesaColaborador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacao_mesa_colaborador);
    }
    public void validarReserva(){
        Intent intent = new Intent(ValidacaoMesaColaborador.this, ValidacaoMesaGestor.class);
        startActivity(intent);
    }
}
