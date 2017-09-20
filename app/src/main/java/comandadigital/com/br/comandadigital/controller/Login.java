package comandadigital.com.br.comandadigital.controller;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import comandadigital.com.br.comandadigital.R;

public class Login extends AppCompatActivity {
    EditText email;
    EditText senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void efetuarLogin(View view){
        //Pegando os valores da view activity_login, atravas de seu ID
        email = (EditText) findViewById(R.id.editTextUserEmail);
        senha = (EditText) findViewById(R.id.editTextPassword);

        validar(email, senha);


    }

    private void validar(EditText email, EditText senha) {
        Intent intent = new Intent(Login.this, SelecaoEstabelecimento.class);
        startActivity(intent);
    }
}
