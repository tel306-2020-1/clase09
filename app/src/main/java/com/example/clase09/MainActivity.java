package com.example.clase09;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void abrirGoogleMaps(View view){
        startActivity(new Intent(this,MapsActivity.class));
    }

    public void abrirFechaDialog(View view){
        DatePickerFragment datePickerFragment = new DatePickerFragment();
        datePickerFragment.show(getSupportFragmentManager(),"datePicker");
    }

    public void mostrarFechaSeleccionada(int anio, int mes, int dia){
        Log.d("infoApp","en activity --> año: " + anio + " | mes: " + mes + " | dia: " + dia);
        TextView textView = findViewById(R.id.textView);
        textView.setText("año: " + anio + " | mes: " + (mes + 1) + " | dia: " + dia);
    }
}