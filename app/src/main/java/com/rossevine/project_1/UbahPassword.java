package com.rossevine.project_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.OnClick;

public class UbahPassword extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah_password);
    }
    @OnClick(R.id.buttonGantiPassword)
    public void  ubahPassword(){

    }
}
