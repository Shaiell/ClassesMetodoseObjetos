package br.ici.treinamento.classesmetodoseobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Jair jair = new Jair();
        jair.direitosDeveres();
    }

    Pessoa pessoa = new Pessoa();



}
