package com.example.parametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);
    }

    //Método para el botón enviar
    public void Enviar(View view){
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("dato", et1.getText().toString()+"\n"+"Tu correo es: "+et2.getText().toString()+"\n"+"Tu telefono es: "+et3.getText().toString());
        startActivity(i);
    }

}
