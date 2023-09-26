package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaHome extends AppCompatActivity {
    TextView text_nome;
    Button btn_sair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_home);
        btn_sair = findViewById(R.id.btn_sair);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nomeUsuario = extras.getString("nomeUsuario");
            text_nome = findViewById(R.id.text_nome);
            text_nome.setText("Usuário Logado: " + nomeUsuario);
        }

        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaHome.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}