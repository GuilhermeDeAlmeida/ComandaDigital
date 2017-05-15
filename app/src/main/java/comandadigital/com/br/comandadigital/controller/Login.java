package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import comandadigital.com.br.comandadigital.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void efetuarLogin(View view){
        Intent intent = new Intent(Login.this, SelecaoEstabelecimento.class);
        startActivity(intent);
    }
}
