package com.rossevine.project_1;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddPengeluwaranActivity extends AppCompatActivity {
    EditText textViewDate;
    int year,month,day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_pengeluwaran);
        ButterKnife.bind(this);
        updateTxtTime();
    }
    Calendar calendar=Calendar.getInstance();
    DatePickerDialog.OnDateSetListener date=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,monthOfYear);
            calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
            updateTxtTime();
        }
    };

    private void updateTxtTime(){
        String format = "dd/MM/YYYY";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format, Locale.US);
        textViewDate.setText(simpleDateFormat.format(calendar.getTime()));
    }
    @OnClick(R.id.editTextDate_Pengeluwaran)
    public void onClickTxtTime(View v){
        new DatePickerDialog(this,date,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
    }
}
