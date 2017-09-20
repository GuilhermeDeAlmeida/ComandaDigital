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

public class Cadastro extends AppCompatActivity {
    EditText email;
    EditText senha;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        //variável firebaseAuth pegando o as informações da API Firebase
        firebaseAuth = FirebaseAuth.getInstance();
    }
    public void cadastrar(View view){

        //Pegando os valores da view activity_login, atravas de seu ID
        email = (EditText) findViewById(R.id.editTextEmail);
        senha = (EditText) findViewById(R.id.editTextPassword);

        //Fazendo validação via API Firebase
        firebaseAuth.createUserWithEmailAndPassword(email.getText().toString(), senha.getText().toString()).addOnCompleteListener(Cadastro.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                //Testa se foi bem sucedido o cadastro
                if(task.isSuccessful()){
                    Intent intent = new Intent(Cadastro.this, SelecaoEstabelecimento.class);
                    startActivity(intent);
                }else{
                    Log.i("cadastro","Usuário não cadastrado no sistema");
                }

            }
        });

    }
}
