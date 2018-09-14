package com.pavietnam.mvprxjava.ui.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pavietnam.mvprxjava.R;

public class LoginActivity extends AppCompatActivity implements ILogin.IView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void loginSuccess(String token) {

    }
}
