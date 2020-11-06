package com.example.clase09;

import android.app.DatePickerDialog;
import android.util.Log;
import android.widget.DatePicker;

import androidx.fragment.app.FragmentActivity;

public class RecepcionFechaSeleccionadaListener implements DatePickerDialog.OnDateSetListener {

    private FragmentActivity fragmentActivity;

    public RecepcionFechaSeleccionadaListener() {
    }

    public RecepcionFechaSeleccionadaListener(FragmentActivity fragmentActivity) {
        this.fragmentActivity = fragmentActivity;
    }

    @Override
    public void onDateSet(DatePicker datePicker, int anio, int mes, int dia) {

        Log.d("infoApp", "año: " + anio + " | mes: " + mes + " | dia: " + dia);

        MainActivity mainActivity = (MainActivity) fragmentActivity;
        mainActivity.mostrarFechaSeleccionada(anio,mes,dia);

    }
}
