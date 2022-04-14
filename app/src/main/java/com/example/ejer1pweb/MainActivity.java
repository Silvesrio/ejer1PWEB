package com.example.ejer1pweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtResultado;
    private Button btnMostrar, btnInvertir;
    private EditText etNombre, etCelular;

    private  String nombre;
    private int calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        //Configurar el boton para que este pendiente de un evento (al momentop que haga click en el boton)
        //Parametro de la funcion espera que le mandes tu logica dessarollada que quiere que se aplique cada que el usuarioa haga click
        btnMostrar.setOnClickListener(this);
        btnInvertir.setOnClickListener(this);
    }

    private  void inicializarVistas(){
        //Inicializamos vistas y referenciamos nuestros componentes visuales diseñados con los atributos o variables que emos creado
        txtResultado = findViewById(R.id.txtResultado);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnInvertir = findViewById(R.id.btnInvertir);
        etNombre = findViewById(R.id.etNombre);
        etCelular = findViewById(R.id.etCelular);
    }
    private void obtenerValores(){

    }

    private  void  mostrarTexto(){

        //Como obtener los datos que el usuario ingreso al componente de texto
        //to.String() -> Combierte la cadena de texto del campo referenciado
        nombre = etNombre.getText().toString();
        String celularTexto = etCelular.getText().toString();
        //Usar conosimientos de Java para Parsear un variable

        calcular = Integer.parseInt(celularTexto);

        txtResultado.setText("Nombre: "+this.nombre+" Celular: "+this.calcular);
    }

    private void  inverirNumero(){
        //invertir numero
        //12345 -> 54321
        int resto = 0, invertido =0;
        while (this.calcular > 0){

            resto = this.calcular % 10;
            invertido = invertido* 10 +resto;

            this.calcular=this.calcular / 10;
        }

        txtResultado.setText("Invertido: "+invertido);
    }

    @Override
    public void onClick(View view) {
        mostrarTexto();
        inverirNumero();
        obtenerValores();
        //switch (view.getId())
    }
}