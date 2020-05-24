package com.hackinghelp.homehelptherapy;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText txtEmail, txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = findViewById(R.id.text_login_email);
        txtSenha = findViewById(R.id.text_login_senha);

    }



    public void btnLogin(View v)
    {
        //Futuramente conectar-se ao WebService e realizar de fato a autenticação

        if(!txtEmail.getText().toString().isEmpty() && !txtSenha.getText().toString().isEmpty())
        {
            
        }
        else
        {
            Toast.makeText(this, "Preencha os campos", Toast.LENGTH_SHORT).show();
        }


    }

    public void btnCadastro(View v)
    {
        startActivity(new Intent(this,Cadastro.class));
    }

}
