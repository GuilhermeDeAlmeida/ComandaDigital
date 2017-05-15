package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import comandadigital.com.br.comandadigital.R;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }
    public void cadastrar(View view){
        Intent intent = new Intent(Cadastro.this, SelecaoEstabelecimento.class);
        startActivity(intent);
    }
}
