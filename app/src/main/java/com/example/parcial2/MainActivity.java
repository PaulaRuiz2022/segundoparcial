package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    private EditText usu;
    private Button ing;

    private operacion1 agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=findViewById(R.id.primero);
        pass =findViewById(R.id.segundo);
        usu=findViewById(R.id.res);
        ing=findViewById(R.id.resul);
        agregar= new  operacion1(int num_1 "0", int num_2 "0");

        ing.setOnClickListener(view -> {
            String numero1 = agregar.getnum_1();
            String numero2 = agregar.getnum_2();

            if(user.getText().toString().equals("0") && pass.getText().toString().equals("0")) {
                Intent ingresar = new Intent(this, operacion1.class);
                Bundle persona = new Bundle();
                ingresar.putExtras(persona);
                startActivity(ingresar);
                Toast.makeText(MainActivity.this, "¡Resultado Correcto!", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(MainActivity.this,"Resultado Incorrecto",Toast.LENGTH_SHORT).show();
            }
        });
    }
}