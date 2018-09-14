package com.pavietnam.mvprxjava.data;

import com.pavietnam.mvprxjava.data.remote.RetrofitApi;
import com.pavietnam.mvprxjava.data.remote.RetrofitClient;
import com.pavietnam.mvprxjava.data.remote.model.User;

import java.util.List;

import io.reactivex.Observable;

public class Repository implements IRepository{

    private RetrofitApi api = RetrofitClient.getClient();

    @Override
    public Observable<List<User>> getAllUser() {
        return api.getAllUser().toObservable();
    }
}
