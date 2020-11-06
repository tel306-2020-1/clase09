package com.example.clase09;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment{

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        Log.d("infoApp", String.valueOf(year));
        int month = calendar.get(Calendar.MONTH);
        Log.d("infoApp", String.valueOf(month));
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        Log.d("infoApp", String.valueOf(dia));

        return new DatePickerDialog(getActivity(),new RecepcionFechaSeleccionadaListener(getActivity()),year,month,dia);
    }
}
