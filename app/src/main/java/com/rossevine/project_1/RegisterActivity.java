package com.rossevine.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import com.rossevine.project_1.Task.LoginTask;
import com.rossevine.project_1.Task.RegisterTask;
import com.rossevine.project_1.Wrapper.UserWrapper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {
    @BindView(R.id.txtName_Registrasi)
    EditText txtNameRegistrasi;

    @BindView(R.id.txtEmail_Registrasi)
    EditText txtEmailRegistrasi;

    @BindView(R.id.txtRePassword_Registrasi)
    EditText txtRePasswordRegistrasi;
    @BindView(R.id.txtPassword_Registrasi)
    EditText txtPasswordRegistrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    public void openDataActivity(UserWrapper userWrapper) {

        Intent intent = new Intent(RegisterActivity.this, LoginTask.class);

        this.startActivity(intent);
        this.finish();

    }

    @OnClick(R.id.btnRegistrasi)
    void btnRegistrasiOnClick() {
        if (!TextUtils.isEmpty(txtEmailRegistrasi.getText().toString().trim())
                && !TextUtils.isEmpty(txtNameRegistrasi.getText().toString().trim())
                && !TextUtils.isEmpty(txtRePasswordRegistrasi.getText().toString().trim())
                && !TextUtils.isEmpty(txtPasswordRegistrasi.getText().toString().trim())
                ) {
            if (txtRePasswordRegistrasi.getText().toString().trim().equals(txtPasswordRegistrasi.getText().toString().trim())) {
                RegisterTask registerTask = new RegisterTask(this);
                registerTask.execute(txtNameRegistrasi.getText().toString(), txtEmailRegistrasi.getText().toString(), txtPasswordRegistrasi.getText().toString());
            }
        } else {
            Toast.makeText(this, "Please fill name/email/password and repassword", Toast.LENGTH_SHORT).show();
        }
    }

}
