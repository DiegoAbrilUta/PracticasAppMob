package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //Declarar variables
    private EditText et_rango;
    private TextView tv_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Guardar el tipo texto en las variables creadas
        et_rango=findViewById(R.id.editTextRango);
        tv_resultado=findViewById(R.id.textViewFbVista);
    }
    //Metodo onclick
    public void onClicFibonacci(View view){
        Fibonacci();
    }

    //METODO
    public void Fibonacci(){
        //INICIO
        int rango=Integer.parseInt(et_rango.getText().toString());
        //INSTANCIAR
        FibonacciSerie fb=new FibonacciSerie();
        //PROCESO-SALIDA
        tv_resultado.setText(String.valueOf(fb.Fibonacci(rango)));
    }
    public void Limpiar(){
        et_rango.setText(String.valueOf(""));
        tv_resultado.setText(String.valueOf(" "));

    }
}