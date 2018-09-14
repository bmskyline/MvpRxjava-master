package com.pavietnam.mvprxjava.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.pavietnam.mvprxjava.R;
import com.pavietnam.mvprxjava.data.remote.model.User;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IMain.IView{


    MainPresenter mMainPresenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainPresenter.loadUsers();
    }

    @Override
    public void getListUserSuccess(List<User> list) {
        Log.d("TAG", "getListUserSuccess: "+list.size());
    }

    @Override
    public void getListUserFailed(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
