package com.rossevine.project_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import com.rossevine.project_1.Task.LoginTask;
import com.rossevine.project_1.entity.UserWrapper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.txtEmail_LoginActivity)
    EditText txtEmail;
    @BindView(R.id.txtPassword_LoginActivity)
    EditText txtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin_LoginActivity)
    void btnLoginOnClick() {
        if (!TextUtils.isEmpty(txtEmail.getText().toString().trim())
                && !TextUtils.isEmpty(txtPassword.getText().toString().trim())) {
            LoginTask userLoginTask = new LoginTask(this);
            userLoginTask.execute(txtEmail.getText().toString(), txtPassword.getText().toString());
        } else {
            Toast.makeText(this, "Please fill username and password", Toast.LENGTH_SHORT).show();
        }
  }

    public void openDataActivity(UserWrapper userWrapper) {
        if (userWrapper !=  null  && userWrapper.getStatus() == 1 &&  userWrapper.getUser()!= null ) {
            Toast.makeText(this, userWrapper.getMessage(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this,ProfileActivity.class);
            this.startActivity(intent);
            this.finish();
        } else {
            Toast.makeText(this, this.getResources().getString(R.string.email),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
