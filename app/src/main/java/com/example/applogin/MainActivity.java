package com.example.applogin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit_usuario, edit_senha;
    Button btn_entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_usuario = findViewById(R.id.edit_usuario);
        edit_senha = findViewById(R.id.edit_senha);
        btn_entrar = findViewById(R.id.btn_entrar);

        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usuario = edit_usuario.getText().toString();
                String senha = edit_senha.getText().toString();
                String nome = "Tiago";

                if (usuario.equals("Tiago") && senha.equals("123456")) {
                    Intent intent = new Intent(MainActivity.this, TelaHome.class);
                    intent.putExtra("nomeUsuario",nome);
                    startActivity(intent);
                    finish();
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("App Login");
                    builder.setMessage("Usuário e/ou senha incorreta, tente novamente!");
                    builder.setNeutralButton("OK",null);
                    builder.show();
                }
            }
        });
    }
}