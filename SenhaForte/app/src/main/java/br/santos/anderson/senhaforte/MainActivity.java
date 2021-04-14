package br.santos.anderson.senhaforte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickValidar(View v){
        String login = ((EditText)findViewById(R.id.login)).getText().toString();
        String senha = ((EditText)findViewById(R.id.senha)).getText().toString();
        String confirmacaoSenha = ((EditText)findViewById(R.id.confirmacaoSenha)).getText().toString();

        ValidarSenha validarSenha = new ValidarSenha();

        if(!validarSenha.confirmacaoSenha(senha, confirmacaoSenha))
            Toast.makeText(this, "Senhas não conferem", Toast.LENGTH_LONG).show();
        else
            if(!validarSenha.conferir(senha))
                Toast.makeText(this, "Senha fraca", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "Senha validada", Toast.LENGTH_LONG).show();
    }
}