package com.hackinghelp.homehelptherapy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro extends Activity {

    EditText txtNome,txtEmail,txtSenha,txtConfSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        getCampos();

    }


    public void btnCriarConta(View v)
    {
        if(verificaCampos())
        {
            Toast.makeText(this, "Um E-mail de confirmação foi enviado para " + txtEmail.getText().toString(), Toast.LENGTH_LONG).show();
            startActivity(new Intent(this,MainActivity.class));
        }
        else
        {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG).show();
        }
    }


    boolean verificaCampos()
    {
        if(!txtNome.getText().toString().isEmpty() && !txtEmail.getText().toString().isEmpty() &&
            !txtSenha.getText().toString().isEmpty() && !txtConfSenha.getText().toString().isEmpty())
            return true;

        return false;
    }

    void getCampos()
    {
        txtNome = findViewById(R.id.text_cadstro_nome);
        txtEmail = findViewById(R.id.text_cadstro_email);
        txtSenha = findViewById(R.id.text_cadstro_senha);
        txtConfSenha = findViewById(R.id.text_cadstro_confirmaSenha);
    }


}
