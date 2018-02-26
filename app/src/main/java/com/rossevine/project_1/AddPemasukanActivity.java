package com.rossevine.project_1;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddPemasukanActivity extends AppCompatActivity {
    EditText textViewDate;
    int year, month, day;
    @BindView(R.id.spinnerCategory_AddPemasukan)
    Spinner spinnerCategory_AddPemasukan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_pemasukan);
        ButterKnife.bind(this);
        textViewDate = findViewById(R.id.editTextDate_Pemasukan);
        updateTxtTime();
    }

    Calendar calendar = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, monthOfYear);
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateTxtTime();
        }
    };

    private void updateTxtTime() {
        String format = "dd/MM/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.US);
        textViewDate.setText(simpleDateFormat.format(calendar.getTime()));
    }

    @OnClick(R.id.editTextDate_Pemasukan)
    public void onClickTxtTime(View v) {
        new DatePickerDialog(this, date, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    public void arrayCategory() {
        List<String> categoryPemasukan = new ArrayList<>();
        categoryPemasukan.add("Bandung");
        ArrayAdapter<String> citiesAdaptes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoryPemasukan);
        spinnerCategory_AddPemasukan.setAdapter(citiesAdaptes);
    }
}
