package com.rossevine.project_1;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileActivity extends AppCompatActivity {
    String email;
    String name;

    @BindView(R.id.txtName_Profile)
    TextView textName;

    @BindView(R.id.txtEmail_Profile)
    TextView textEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);
        email =getIntent().getStringExtra("email");
        name = getIntent().getStringExtra("name");
        textName.setText(name);
        textEmail.setText(email);

    }

    @OnClick(R.id.buttonMasukanPengeluwaran)
    public void MunculTampilanAddMasPe() {
        final CharSequence pilihan[] = new CharSequence[]{"Pemasukan", "Pengeluwaran"};

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add Pemasukan/Pengeluwaran");
        builder.setItems(pilihan, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                if (pilihan[i].equals("Pemasukan")) {
                    Intent intent = new Intent(ProfileActivity.this, AddPemasukanActivity.class);
                    startActivity(intent);
                } else if (pilihan[i].equals("Pengeluwaran")) {
                    Intent intent = new Intent(ProfileActivity.this, AddPengeluwaranActivity.class);
                    startActivity(intent);
                }
            }
        });
        builder.show();
    }

    @OnClick(R.id.buttonUbahPassword)
    public void tampilanUbahPassword() {
        Intent intent = new Intent(ProfileActivity.this, UbahPassword.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonAlokasiData)
    public void buttonAlokasiDataOnClick() {
        Intent intent = new Intent(ProfileActivity.this, AlokasiDanaActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.btnLaporanPengePema)
    public void  btnLaporanPengeluaranPemasukanOnClick(){
        final CharSequence pilihan[] = new CharSequence[]{"Pemasukan", "Pengeluwaran"};

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Laporan Pemasukan/Pengeluwaran");
        builder.setItems(pilihan, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                if (pilihan[i].equals("Pemasukan")) {
                    Intent intent = new Intent(ProfileActivity.this, LaporanActivity.class);
                    startActivity(intent);
                } else if (pilihan[i].equals("Pengeluwaran")) {
                    Intent intent = new Intent(ProfileActivity.this, LaporanPengeluwaranActivity.class);
                    startActivity(intent);
                }
            }
        });
        builder.show();
    }
//    public void setTanggal() {
//        TextView txtTanggal = findViewById(R.id.textView2);
//        Calendar c = Calendar.getInstance();
//        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
//        String formattedDate = df.format(c.getTime());
//        txtTanggal.setText("Tanggal : " + formattedDate);
//
//        TextView txtPenghasilan = findViewById(R.id.textView);
//        txtPenghasilan.setText("Rp 50.000.00");
//        txtPenghasilan.setTextColor(Color.GREEN);
//
//
//        TextView txtPengeluwaran = findViewById(R.id.textView3);
//        txtPengeluwaran.setText("Rp 50.000.00");
//        txtPengeluwaran.setTextColor(Color.RED);
//
//
//    }
}
