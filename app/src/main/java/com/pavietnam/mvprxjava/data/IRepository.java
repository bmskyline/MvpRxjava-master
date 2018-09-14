package com.pavietnam.mvprxjava.data;

import com.pavietnam.mvprxjava.data.remote.model.User;

import java.util.List;

import io.reactivex.Observable;

public interface IRepository {

    Observable<List<User>> getAllUser();
}
